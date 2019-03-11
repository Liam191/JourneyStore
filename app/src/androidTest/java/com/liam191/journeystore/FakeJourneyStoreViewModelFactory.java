package com.liam191.journeystore;

import com.liam191.journeystore.feature_addjourney.AddJourneyViewModel;
import com.liam191.journeystore.feature_addjourney.AddJourneyViewModelImpl;
import com.liam191.journeystore.feature_addjourney.FakeAddJourneyViewModelImpl;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

class FakeJourneyStoreViewModelFactory extends JourneyStoreViewModelFactory {

    private final JourneyRepository journeyRepository;

    FakeJourneyStoreViewModelFactory(JourneyRepository journeyRepository){
        super(journeyRepository);
        this.journeyRepository = journeyRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass == AddJourneyViewModel.class){
            return (T) new FakeAddJourneyViewModelImpl(journeyRepository);
        }
        throw new IllegalArgumentException(String.format("Requested class %s did not match expected class %s.", modelClass, AddJourneyViewModelImpl.class));
    }
}
