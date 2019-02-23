package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepositoryComponent;

import dagger.Component;

@Component(modules = MockJourneyRepositoryModule.class)
public interface MockJourneyRepositoryComponent extends JourneyRepositoryComponent {

    MockJourneyRepository mockJourneyRepositoryComponent();
}
