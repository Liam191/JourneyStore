package com.liam191.journeystore.feature_addjourney;

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
        journeyRepository.addJourney(journeyToAdd);
    }
}