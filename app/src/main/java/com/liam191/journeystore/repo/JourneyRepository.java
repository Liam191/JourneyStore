package com.liam191.journeystore.repo;

import java.util.List;

public interface JourneyRepository {
    void addJourney(Journey journeyToAdd);

    List<Journey> getJourneys();
}
