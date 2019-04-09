package com.liam191.journeystore;

import android.util.Log;

import com.liam191.journeystore.feature_addjourney.AddJourneyActivity;
import com.liam191.journeystore.feature_journeylist.JourneyListActivity;
import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.test.rule.ActivityTestRule;

public class FakeJourneyStoreApplication extends JourneyStoreApplication {

    private static final String TAG = FakeJourneyStoreApplication.class.getSimpleName();
    private final FakeJourneyStoreViewModelFactory fakeJourneyStoreViewModelFactory;
    private static FakeJourneyStoreApplication instance;

    {
        instance = this;
        JourneyRepository defaultJourneyRepo = new FakeJourneyRepositoryImpl();
        Log.i(TAG, "testingJourneyStore... defaultJourneyRepo: "+ defaultJourneyRepo.toString());

        fakeJourneyStoreViewModelFactory = new FakeJourneyStoreViewModelFactory(defaultJourneyRepo);
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public JourneyStoreViewModelFactory getViewModelFactory(){
        return fakeJourneyStoreViewModelFactory;
    }

    public static JourneyRepository getFactoryJourneyRepository() {
        return instance.fakeJourneyStoreViewModelFactory.getJourneyRepository();
    }

    public static void setFactoryJourneyRepository(JourneyRepository journeyRepository) {
        instance.fakeJourneyStoreViewModelFactory.setJourneyRepository(journeyRepository);
    }

    public static void resetFactoryJourneyRepository() {
        instance.fakeJourneyStoreViewModelFactory.getJourneyRepository().reset();
    }
}
