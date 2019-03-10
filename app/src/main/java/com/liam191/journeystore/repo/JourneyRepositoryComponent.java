package com.liam191.journeystore.repo;

import com.liam191.journeystore.JourneyStoreViewModel;
import com.liam191.journeystore.feature_addjourney.AddJourneyViewModel;

import javax.inject.Singleton;

import androidx.lifecycle.AndroidViewModel;
import dagger.Component;

@Singleton
@Component(modules = {
        JourneyRepositoryModule.class
})
public interface JourneyRepositoryComponent {
    void injectAndroidViewModel(JourneyStoreViewModel viewModel);
}
