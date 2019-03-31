package com.liam191.journeystore;

import com.liam191.journeystore.feature_addjourney.AddJourneyViewModel;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class JourneyStoreViewModelFactory implements ViewModelProvider.Factory {

    private final JourneyRepository journeyRepository;

    public JourneyStoreViewModelFactory(JourneyRepository journeyRepository){
        this.journeyRepository = journeyRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass == AddJourneyViewModel.class){
            return (T) new AddJourneyViewModel(journeyRepository);
        }
        throw new IllegalArgumentException(String.format("Requested class %s did not match expected class %s.", modelClass, AddJourneyViewModel.class));
    }
}
