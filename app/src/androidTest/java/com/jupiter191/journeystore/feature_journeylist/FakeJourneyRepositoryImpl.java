package com.jupiter191.journeystore.feature_journeylist;

import android.util.Log;

import com.jupiter191.journeystore.repo.Journey;
import com.jupiter191.journeystore.repo.JourneyRepository;

import java.util.ArrayList;
import java.util.List;

class FakeJourneyRepositoryImpl implements JourneyRepository {

    private static final String TAG = FakeJourneyRepositoryImpl.class.getSimpleName();

    @Override
    public void addJourney(Journey journeyToAdd) {
        Log.e(TAG, "IN MOCK JOURNEY REPO IMPL - addJourney: "+ journeyToAdd.toString());
    }

    @Override
    public List<Journey> getJourneys() {
        Log.e(TAG, "IN MOCK JOURNEY REPO IMPL - getJourneys");
        ArrayList<Journey> journeyList = new ArrayList<>();
        journeyList.add(new Journey(1));
        return journeyList;
    }
}
