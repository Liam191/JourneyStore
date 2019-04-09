package com.liam191.journeystore;

import android.util.Log;

import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;
import com.liam191.journeystore.repo.JourneyRepositoryImpl;
import com.liam191.journeystore.repo.LocalJourneyStoreRoomDBImpl;
import com.liam191.journeystore.repo.localStore.LocalJourneyStore;

public class FakeJourneyStoreApplication extends JourneyStoreApplication {

    private static final String TAG = FakeJourneyStoreApplication.class.getSimpleName();
    private JourneyStoreViewModelFactory journeyStoreViewModelFactory;
    private static FakeJourneyStoreApplication instance;

    {
        instance = this;
        JourneyRepository defaultJourneyRepo = new FakeJourneyRepositoryImpl();
        Log.i(TAG, "testingJourneyStore... defaultJourneyRepo: "+ defaultJourneyRepo.toString());

        journeyStoreViewModelFactory = new FakeJourneyStoreViewModelFactory(defaultJourneyRepo);
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public JourneyStoreViewModelFactory getViewModelFactory(){
        return journeyStoreViewModelFactory;
    }

    public static void useRealViewModelFactory(){
        LocalJourneyStore localStore = new LocalJourneyStoreRoomDBImpl();
        //JourneyRepository realJourneyRepo = new JourneyRepositoryImpl(localStore);
        JourneyRepository realJourneyRepo = new JourneyRepositoryImpl();
        instance.journeyStoreViewModelFactory = new JourneyStoreViewModelFactory(realJourneyRepo);
    }

    public static void useFakeViewModelFactory(){
        JourneyRepository fakeJourneyRepo = new FakeJourneyRepositoryImpl();
        instance.journeyStoreViewModelFactory = new FakeJourneyStoreViewModelFactory(fakeJourneyRepo);
    }

    public static JourneyRepository getFactoryJourneyRepository() {
        return ((FakeJourneyStoreViewModelFactory) instance.journeyStoreViewModelFactory).getJourneyRepository();
    }

    public static void setFactoryJourneyRepository(JourneyRepository journeyRepository) {
        ((FakeJourneyStoreViewModelFactory) instance.journeyStoreViewModelFactory).setJourneyRepository(journeyRepository);
    }

    public static void resetFactoryJourneyRepository() {
        ((FakeJourneyStoreViewModelFactory) instance.journeyStoreViewModelFactory).getJourneyRepository().reset();
    }
}
