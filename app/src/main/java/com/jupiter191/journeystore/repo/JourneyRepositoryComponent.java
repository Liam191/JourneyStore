package com.jupiter191.journeystore.repo;

import dagger.Component;

@Component(modules = JourneyRepositoryModule.class)
public interface JourneyRepositoryComponent {

    JourneyRepository getJourneyRepository();
}
