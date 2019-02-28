package com.liam191.journeystore.feature_journeylist;

import android.util.Log;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

class FakeJourneyRepositoryImpl implements JourneyRepository {

    private static final String TAG = FakeJourneyRepositoryImpl.class.getSimpleName();

    private ArrayList<Journey> journeyList = new ArrayList<>();
    private LiveData<List<Journey>> liveJourneyList;

    {
        journeyList.add(new Journey(1));
        journeyList.add(new Journey(2));
        journeyList.add(new Journey(3));
        journeyList.add(new Journey(4));
        journeyList.add(new Journey(5));
        journeyList.add(new Journey(6));
        journeyList.add(new Journey(7));
        journeyList.add(new Journey(8));

        MutableLiveData<List<Journey>> mutableJourneyList = new MutableLiveData<>();
        mutableJourneyList.setValue(journeyList);
        liveJourneyList = mutableJourneyList;
    }

    @Override
    public void addJourney(Journey journeyToAdd) {
        Log.e(TAG, "IN MOCK JOURNEY REPO IMPL - addJourney: "+ journeyToAdd.toString());
    }

    @Override
    public LiveData<List<Journey>> getJourneys() {
        Log.e(TAG, "IN MOCK JOURNEY REPO IMPL - getJourneys");

        return liveJourneyList;
    }
}
