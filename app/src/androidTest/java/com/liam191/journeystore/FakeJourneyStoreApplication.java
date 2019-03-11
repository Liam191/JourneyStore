package com.liam191.journeystore;

import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;

public class FakeJourneyStoreApplication extends JourneyStoreApplication {

    private final JourneyStoreViewModelFactory fakeJourneyStoreViewModelFactory;

    {
        final JourneyRepository fakeJourneyRepository = new FakeJourneyRepositoryImpl();
        fakeJourneyStoreViewModelFactory = new FakeJourneyStoreViewModelFactory(fakeJourneyRepository);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public JourneyStoreViewModelFactory getViewModelFactory(){
        return fakeJourneyStoreViewModelFactory;
    }
}
