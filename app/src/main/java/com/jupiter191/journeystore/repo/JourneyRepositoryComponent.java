package com.jupiter191.journeystore.repo;

import java.util.List;

import dagger.Component;

@Component(modules = {JourneyRepositoryModule.class})
public interface JourneyRepositoryComponent {

    JourneyRepository journeyRepository();
}
