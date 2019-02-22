package com.jupiter191.journeystore.repo;

import com.jupiter191.journeystore.repo.localStore.LocalJourneyStore;

import java.util.List;

import javax.inject.Inject;

public class JourneyRepository{

    private static final String TAG = "JourneyRepository";

    private LocalJourneyStore localJourneyStore;

    @Inject
    public JourneyRepository(LocalJourneyStore localJourneyStore){
        this.localJourneyStore = localJourneyStore;
    }

    public Journey addJourney(){
        return null;
    }

    public Journey getJourney(String id){
        return null;
    }

    public List<Journey> getJourneys(){
        return null;
    }

    public Journey updateJourney(String id){
        return null;
    }

    public Journey deleteJourney(String id){
        return null;
    }

}
