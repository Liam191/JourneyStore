package com.liam191.journeystore.repo;

import android.util.Log;

import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

public class JourneyRepositoryImpl implements JourneyRepository{

    private static final String TAG = JourneyRepositoryImpl.class.getSimpleName();

    JourneyRepositoryImpl(){
    }

    //TODO: Add tests for these methods
    //TODO: Add proper implementations of these methods
    @Override
    public void addJourney(Journey journeyToAdd) {
        Log.i(TAG, "----> In addJourney. Journey to add: "+ journeyToAdd.toString());
    }

    @Override
    public LiveData<List<Journey>> getJourneys(){
        return null;
    }
}
