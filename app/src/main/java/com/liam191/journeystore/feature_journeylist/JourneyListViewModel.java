package com.liam191.journeystore.feature_journeylist;

import android.util.Log;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

@SuppressWarnings("WeakerAccess") // Necessary for use with ViewModelProviders access from JourneyListActivity
public class JourneyListViewModel extends ViewModel {

    private static final String TAG = JourneyListViewModel.class.getSimpleName();

    public JourneyRepository journeyRepository;
    private LiveData<List<Journey>> liveJourneyList;

    LiveData<List<Journey>> getJourneys(){
        if(liveJourneyList == null){
            liveJourneyList = journeyRepository.getJourneys();
        }
        return liveJourneyList;
    }
}
