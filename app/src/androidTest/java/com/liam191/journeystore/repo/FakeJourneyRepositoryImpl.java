package com.liam191.journeystore.repo;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class FakeJourneyRepositoryImpl implements JourneyRepository {

    private static final String TAG = FakeJourneyRepositoryImpl.class.getSimpleName();

    private MutableLiveData<List<Journey>> liveJourneyList;
    private List<Journey> journeyList;

    public FakeJourneyRepositoryImpl(){
        reset();
    }

    public void reset(){
        journeyList = new ArrayList<>();
        liveJourneyList = new MutableLiveData<>();
        liveJourneyList.postValue(journeyList);
    }

    @Override
    public void addJourney(Journey journeyToAdd) {
        Log.i(TAG, "testingJourneyStore... fakeJourneyRep instance: "+ toString());

//        Log.i(TAG, "testingJourneyStore... addJourney(): journeyToAdd = "+ journeyToAdd.toString());
        // Possible wrong implementation. May not be able to detect changes to list items. See possible solution below code
//        Log.i(TAG, "testingJourneyStore... journeyList: pre-add = "+ journeyList.toString());
        journeyList.add(journeyToAdd);
//        Log.i(TAG, "testingJourneyStore... journeyList: post-add = "+ journeyList.toString());

//        Log.i(TAG, "testingJourneyStore... liveJourneyList: pre-postValue = "+ liveJourneyList.getValue().toString());
        liveJourneyList.postValue(journeyList);
//        Log.i(TAG, "testingJourneyStore... liveJourneyList: post-postValue = "+ liveJourneyList.getValue().toString());

        // Clone original Journey list
        // add new Journey
        // post value of new Journey list
    }

    @Override
    public LiveData<List<Journey>> getJourneys() {
        return liveJourneyList;
    }
}
