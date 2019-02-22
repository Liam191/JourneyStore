package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepository;
import com.jupiter191.journeystore.repo.localStore.LocalJourneyStore;

import dagger.Module;
import dagger.Provides;

@Module
class MockJourneyRepositoryModule {

    private static class MockLocalJourneyStore implements LocalJourneyStore{

    }

    @Provides
    static LocalJourneyStore provideLocalJourneyStore() {
        return new MockLocalJourneyStore();
    }

    @Provides
    static JourneyRepository provideJourneyRepository(MockLocalJourneyStore localJourneyStore) {
        return new JourneyRepository(localJourneyStore);
    }
}

