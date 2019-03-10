package com.liam191.journeystore;

import android.app.Application;

import com.liam191.journeystore.repo.DaggerJourneyRepositoryComponent;
import com.liam191.journeystore.repo.JourneyRepositoryComponent;

public class JourneyStoreApplication extends Application {

    private JourneyRepositoryComponent journeyRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        journeyRepositoryComponent = DaggerJourneyRepositoryComponent.builder().build();
    }

    public JourneyRepositoryComponent getJourneyRepositoryComponent(){
        return journeyRepositoryComponent;
    }
}
