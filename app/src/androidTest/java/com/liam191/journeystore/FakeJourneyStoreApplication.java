package com.liam191.journeystore;

import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;

public class FakeJourneyStoreApplication extends JourneyStoreApplication {

    private JourneyStoreViewModelFactory journeyStoreViewModelFactory;

    {
        createViewModelFactoryWithRepository(new FakeJourneyRepositoryImpl());
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public JourneyStoreViewModelFactory getViewModelFactory(){
        return journeyStoreViewModelFactory;
    }

    // Creates a new JourneyStoreViewModelFactory with the specified JourneyRepository reference.
    // This is done to create fresh instances for each test and to use real or fake JourneyRepositories
    // as needed. Likely slower than just setting the JourneyRepository of the
    public void createViewModelFactoryWithRepository(JourneyRepository journeyRepository){
        this.journeyStoreViewModelFactory = new JourneyStoreViewModelFactory(journeyRepository);
    }
}
