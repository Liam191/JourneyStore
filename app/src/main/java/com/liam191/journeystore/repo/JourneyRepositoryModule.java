package com.liam191.journeystore.repo;

import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class JourneyRepositoryModule {

//    @Provides
//    static LocalJourneyStore provideLocalJourneyStore(){
//        return new LocalJourneyStoreRoomDBImpl();
//    }
//
//    @Provides
//    static JourneyRepository provideJourneyRepository(LocalJourneyStore localJourneyStore){
//        return new JourneyRepositoryImpl(localJourneyStore);
//    }

    @Provides
    @Singleton// TEST PROVIDER FOR TESTING ONLY!!!!
    static JourneyRepository provideJourneyRepository(){
        return new JourneyRepositoryImpl();
    }
}
