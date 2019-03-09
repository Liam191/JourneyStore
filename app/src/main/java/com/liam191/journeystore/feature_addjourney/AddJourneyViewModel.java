package com.liam191.journeystore.feature_addjourney;

import android.util.Log;

import com.liam191.journeystore.repo.DaggerJourneyRepositoryComponent;
import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

public class AddJourneyViewModel extends ViewModel {

    private static final String TAG = AddJourneyViewModel.class.getSimpleName();

    //TODO: Inject JourneyRepository
    private JourneyRepository journeyRepository = DaggerJourneyRepositoryComponent
            .builder()
            .build()
            .getJourneyRepository();

    //TODO: Implement addJourney
    //TODO: Connect addJourney to AddJourneyActivity
    void addJourney(Journey journeyToAdd){
        Log.i(TAG, "In AddJourneyViewModel ---> journeyRepository: "+ journeyRepository.toString());
        journeyRepository.addJourney(journeyToAdd);
    }
}
