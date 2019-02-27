package com.liam191.journeystore.repo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = JourneyRepositoryModule.class)
public interface JourneyRepositoryComponent {

    JourneyRepository getJourneyRepository();


}
