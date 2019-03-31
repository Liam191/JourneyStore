package com.liam191.journeystore.feature_addjourney;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.lifecycle.ViewModel;

public class AddJourneyViewModel extends ViewModel {

    private static final String TAG = AddJourneyViewModel.class.getSimpleName();
    private final JourneyRepository journeyRepository;

    public AddJourneyViewModel(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    //TODO: Implement addJourney
    //TODO: Connect addJourney to AddJourneyActivity
    public void addJourney(Journey journeyToAdd){
        journeyRepository.addJourney(journeyToAdd);
    }
}
