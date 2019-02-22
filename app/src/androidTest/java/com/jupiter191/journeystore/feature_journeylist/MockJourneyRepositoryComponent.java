package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepositoryComponent;

import dagger.Component;
import java.util.List;
import dagger.Component;

@Component(modules = MockJourneyRepositoryModule.class)
public interface MockJourneyRepositoryComponent extends JourneyRepositoryComponent {

    MockJourneyRepositoryComponent getJourneyRepositoryComponent();
}
