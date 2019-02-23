package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.repo.JourneyRepository;
import com.jupiter191.journeystore.repo.JourneyRepositoryComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FakeJourneyRepositoryModule.class)
public interface FakeJourneyRepositoryComponent extends JourneyRepositoryComponent {

    JourneyRepository getJourneyRepository();
}
