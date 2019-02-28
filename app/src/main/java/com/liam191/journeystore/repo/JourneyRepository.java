package com.liam191.journeystore.repo;

import java.util.List;

import androidx.lifecycle.LiveData;

public interface JourneyRepository {
    void addJourney(Journey journeyToAdd);
    LiveData<List<Journey>> getJourneys();
}
