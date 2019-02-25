package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.repo.JourneyRepository;
import com.liam191.journeystore.repo.JourneyRepositoryModule;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeJourneyRepositoryModule extends JourneyRepositoryModule {

    @Provides
    static JourneyRepository provideJourneyRepository() {
        return new FakeJourneyRepositoryImpl();
    }
}

