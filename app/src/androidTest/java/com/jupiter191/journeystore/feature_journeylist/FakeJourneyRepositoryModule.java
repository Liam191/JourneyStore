package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepository;
import com.jupiter191.journeystore.repo.JourneyRepositoryModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeJourneyRepositoryModule extends JourneyRepositoryModule {

    @Provides
    static JourneyRepository provideJourneyRepository() {
        return new FakeJourneyRepositoryImpl();
    }
}

