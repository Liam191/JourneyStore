package com.liam191.journeystore;

import android.app.Application;

import com.liam191.journeystore.repo.JourneyRepository;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public abstract class JourneyStoreViewModel extends AndroidViewModel {

    @Inject
    protected JourneyRepository journeyRepository;

    // Creating an abstract class to use JourneyStoreApplication instead of Application
    public JourneyStoreViewModel(@NonNull Application application) {
        super(application);
        ((JourneyStoreApplication) application).getJourneyRepositoryComponent().injectAndroidViewModel(this);
    }
}
