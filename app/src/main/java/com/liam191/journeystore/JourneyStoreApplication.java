package com.liam191.journeystore;

import android.app.Application;

import com.liam191.journeystore.repo.JourneyRepository;
import com.liam191.journeystore.repo.JourneyRepositoryImpl;

public class JourneyStoreApplication extends Application {

    private final JourneyStoreViewModelFactory journeyStoreViewModelFactory;

    {
        final JourneyRepository journeyRepository = new JourneyRepositoryImpl();
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
