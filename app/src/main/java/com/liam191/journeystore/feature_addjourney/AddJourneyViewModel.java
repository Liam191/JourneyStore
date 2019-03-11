package com.liam191.journeystore.feature_addjourney;

import com.liam191.journeystore.repo.Journey;

import androidx.lifecycle.ViewModel;

@SuppressWarnings("WeakerAccess") // Must be public to be extended by test classes.
public abstract class AddJourneyViewModel extends ViewModel {
    abstract void addJourney(Journey journeyToAdd);
}
