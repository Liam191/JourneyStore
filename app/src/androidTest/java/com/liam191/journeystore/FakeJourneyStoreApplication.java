package com.liam191.journeystore;

import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;

public class FakeJourneyStoreApplication extends JourneyStoreApplication {

    private JourneyStoreViewModelFactory journeyStoreViewModelFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        final JourneyRepository fakeJourneyRepository = new FakeJourneyRepositoryImpl();
        journeyStoreViewModelFactory = new FakeJourneyStoreViewModelFactory(fakeJourneyRepository);
    }

    @Override
    public JourneyStoreViewModelFactory getViewModelFactory(){
        return journeyStoreViewModelFactory;
    }

    // To be used in E2E tests to use the real ViewModel factory and repository
    // This method was added to preserve the *private* *final* JourneyStoreViewModelFactory
    // reference in the JourneyStoreApplication class.
    public void setViewModelFactory(JourneyStoreViewModelFactory journeyStoreViewModelFactory){
        this.journeyStoreViewModelFactory = journeyStoreViewModelFactory;
    }
}
