package com.liam191.journeystore.feature_addjourney;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import java.util.List;

import androidx.lifecycle.LiveData;

public class FakeAddJourneyViewModelImpl extends AddJourneyViewModel {

    private final JourneyRepository journeyRepository;

    public FakeAddJourneyViewModelImpl(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    @Override
    void addJourney(Journey journeyToAdd) {

    }
}
