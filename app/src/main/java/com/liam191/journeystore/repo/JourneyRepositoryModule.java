package com.liam191.journeystore.repo;

import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

import dagger.Module;
import dagger.Provides;

@Module
public class JourneyRepositoryModule {

    @Provides
    static LocalJourneyStore provideLocalJourneyStore(){
        return new LocalJourneyStoreRoomDBImpl();
    }

    @Provides
    static JourneyRepository provideJourneyRepository(LocalJourneyStore localJourneyStore){
        return new JourneyRepositoryImpl(localJourneyStore);
    }
}
