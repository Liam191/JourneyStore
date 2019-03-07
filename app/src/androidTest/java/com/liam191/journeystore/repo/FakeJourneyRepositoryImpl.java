package com.liam191.journeystore.repo;

import android.util.Log;

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
        mutableJourneyList.postValue(journeyList);
        liveJourneyList = mutableJourneyList;
    }

    @Override
    public void addJourney(Journey journeyToAdd) {
        MutableLiveData mld = (MutableLiveData)liveJourneyList;
    }

    @Override
    public LiveData<List<Journey>> getJourneys() {
        if(liveJourneyList == null){
            liveJourneyList = new MutableLiveData<>();
        }
        return liveJourneyList;
    }
}
