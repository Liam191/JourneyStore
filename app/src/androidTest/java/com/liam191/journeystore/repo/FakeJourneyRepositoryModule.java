package com.liam191.journeystore.repo;

import dagger.Module;
import dagger.Provides;

@Module
class FakeJourneyRepositoryModule {

    @Provides
    static JourneyRepository provideJourneyRepository() {
        return new FakeJourneyRepositoryImpl();
    }
}

