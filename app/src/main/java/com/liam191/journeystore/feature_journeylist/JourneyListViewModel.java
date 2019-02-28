package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

class JourneyListViewModel extends ViewModel {

    @Inject
    JourneyRepository journeyRepository;

    private LiveData<List<Journey>> liveJourneyList;

    LiveData<List<Journey>> getJourneys(){
        if(liveJourneyList == null){
            liveJourneyList = journeyRepository.getJourneys();
        }
        return liveJourneyList;
    }
}
