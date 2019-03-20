package com.liam191.journeystore.feature_addjourney;

import android.util.Log;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

public class AddJourneyViewModelImpl extends AddJourneyViewModel {

    private static final String TAG = AddJourneyViewModelImpl.class.getSimpleName();
    private final JourneyRepository journeyRepository;

    public AddJourneyViewModelImpl(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    //TODO: Implement addJourney
    //TODO: Connect addJourney to AddJourneyActivity
    public void addJourney(Journey journeyToAdd){
        Log.i(TAG, "In real AddJourneyViewModel");
        journeyRepository.addJourney(journeyToAdd);
    }
}
