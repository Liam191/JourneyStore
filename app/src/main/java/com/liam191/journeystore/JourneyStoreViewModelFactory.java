package com.liam191.journeystore;

import android.util.Log;

import com.liam191.journeystore.feature_addjourney.AddJourneyViewModel;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class JourneyStoreViewModelFactory implements ViewModelProvider.Factory {

    private static final String TAG = JourneyStoreViewModelFactory.class.getSimpleName();
    private final JourneyRepository journeyRepository;

    public JourneyStoreViewModelFactory(JourneyRepository journeyRepository){
        Log.i(TAG, "testingJourneyStore... journeyStoreViewModelFactory journeyRepo: "+ journeyRepository.toString());
        this.journeyRepository = journeyRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        Log.i(TAG, "testingJourneyStore... journeyStoreViewModelFactory create() called with journeyRepo: "+ journeyRepository.toString());
        if(modelClass == AddJourneyViewModel.class){
            return (T) new AddJourneyViewModel(journeyRepository);
        }
        throw new IllegalArgumentException(String.format("Requested class %s did not match expected class %s.", modelClass, AddJourneyViewModel.class));
    }
}
