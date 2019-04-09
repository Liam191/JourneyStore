package com.liam191.journeystore;

import android.app.Application;
import android.util.Log;

import com.liam191.journeystore.repo.JourneyRepository;
import com.liam191.journeystore.repo.JourneyRepositoryImpl;

public class JourneyStoreApplication extends Application {

    private static final String TAG = JourneyStoreApplication.class.getSimpleName();
    private final JourneyStoreViewModelFactory journeyStoreViewModelFactory;

    {
        final JourneyRepository journeyRepository = new JourneyRepositoryImpl();
        Log.i(TAG, "testingJourneyStore... journeyRepo: "+ journeyRepository.toString());

        journeyStoreViewModelFactory = new JourneyStoreViewModelFactory(journeyRepository);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public JourneyStoreViewModelFactory getViewModelFactory(){
        return journeyStoreViewModelFactory;
    }
}
