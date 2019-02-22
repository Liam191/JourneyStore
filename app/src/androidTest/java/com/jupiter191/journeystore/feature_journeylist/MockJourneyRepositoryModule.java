package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepository;
import com.jupiter191.journeystore.repo.localStore.LocalJourneyStore;

import dagger.Module;
import dagger.Provides;

@Module
public class MockJourneyRepositoryModule {

    @Provides
    static JourneyRepository provideJourneyRepository() {
        return new JourneyRepository(new LocalJourneyStore(){}){

        };
    }
}

