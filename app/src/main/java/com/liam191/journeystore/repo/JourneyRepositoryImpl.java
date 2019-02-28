package com.liam191.journeystore.repo;

import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

import java.util.List;

import javax.inject.Inject;

class JourneyRepositoryImpl implements JourneyRepository{

    private static final String TAG = "JourneyRepository";

    private LocalJourneyStore localJourneyStore;

    @Inject
    JourneyRepositoryImpl(LocalJourneyStore localJourneyStore){
        this.localJourneyStore = localJourneyStore;
    }

    @Override
    public void addJourney(Journey journeyToAdd) {
        localJourneyStore.addJourney(journeyToAdd);
    }

    @Override
    public List<Journey> getJourneys(){
        return null;
    }
}
