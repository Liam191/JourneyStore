package com.jupiter191.journeystore.repo;

import com.jupiter191.journeystore.repo.localStore.LocalJourneyStore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class JourneyRepositoryModule {

    @Provides
    @Singleton
    static LocalJourneyStore provideLocalJourneyStore(){
        return new LocalJourneyStoreRoomDBImpl();
    }

    @Provides
    @Singleton
    static JourneyRepository provideJourneyRepository(LocalJourneyStore localJourneyStore){
        return new JourneyRepository(localJourneyStore);
    }
}
