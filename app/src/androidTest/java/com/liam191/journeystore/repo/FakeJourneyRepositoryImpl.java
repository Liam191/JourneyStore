package com.liam191.journeystore.repo;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

class FakeJourneyRepositoryImpl implements JourneyRepository {

    private static final String TAG = FakeJourneyRepositoryImpl.class.getSimpleName();

    private MutableLiveData<List<Journey>> liveJourneyList;
    private List<Journey> journeyList = new ArrayList<>();

    {
        liveJourneyList = new MutableLiveData<>();
        liveJourneyList.postValue(journeyList);
    }

    @Override
    public void addJourney(Journey journeyToAdd) {
        // Possible wrong implementation. May not be able to detect changes to list items. See possible solution below code
        journeyList.add(journeyToAdd);
        liveJourneyList.postValue(journeyList);


        // Clone original Journey list
        // add new Journey
        // post value of new Journey list
    }

    @Override
    public LiveData<List<Journey>> getJourneys() {
        return liveJourneyList;
    }
}
