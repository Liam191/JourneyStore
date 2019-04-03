package com.liam191.journeystore.feature_addjourney;

import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import androidx.lifecycle.ViewModel;

// Suppress weaker access warning as methods are accessed in test classes.
@SuppressWarnings("WeakerAccess")
public class AddJourneyViewModel extends ViewModel {

    private static final String TAG = AddJourneyViewModel.class.getSimpleName();
    private final JourneyRepository journeyRepository;

    private String departureText;

    public AddJourneyViewModel(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public void addJourney(){
        Journey journeyToAdd = new Journey(departureText);
        journeyRepository.addJourney(journeyToAdd);
    }

    public String getDepartureText() {
        return departureText;
    }

    public void setDepartureText(String departureText) {
        this.departureText = departureText;
    }
}
