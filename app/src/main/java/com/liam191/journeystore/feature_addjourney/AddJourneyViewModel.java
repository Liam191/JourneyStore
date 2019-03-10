package com.liam191.journeystore.feature_addjourney;

import android.app.Application;
import com.liam191.journeystore.JourneyStoreViewModel;
import com.liam191.journeystore.repo.Journey;

import androidx.annotation.NonNull;

public class AddJourneyViewModel extends JourneyStoreViewModel {

    private static final String TAG = AddJourneyViewModel.class.getSimpleName();

    public AddJourneyViewModel(@NonNull Application application) {
        super(application);
    }

    //TODO: Implement addJourney
    //TODO: Connect addJourney to AddJourneyActivity
    void addJourney(Journey journeyToAdd){
        journeyRepository.addJourney(journeyToAdd);
    }
}
