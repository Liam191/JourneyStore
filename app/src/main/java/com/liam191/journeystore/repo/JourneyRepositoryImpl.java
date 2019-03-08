package com.liam191.journeystore.repo;

import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

class JourneyRepositoryImpl implements JourneyRepository{

    private static final String TAG = "JourneyRepository";

    private LocalJourneyStore localJourneyStore;

    @Inject
    JourneyRepositoryImpl(LocalJourneyStore localJourneyStore){
        this.localJourneyStore = localJourneyStore;
    }

    //TODO: Add tests for these methods
    //TODO: Add proper implementations of these methods
    @Override
    public void addJourney(Journey journeyToAdd) {
        localJourneyStore.addJourney(journeyToAdd);
    }

    @Override
    public LiveData<List<Journey>> getJourneys(){
        return null;
    }
}
