package com.liam191.journeystore.feature_addjourney;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.util.Log;

import com.liam191.journeystore.FakeJourneyStoreApplication;
import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.Journey;
import com.liam191.journeystore.repo.JourneyRepository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class AddJourneyActivityTest {

    private static final String TAG = AddJourneyActivityTest.class.getSimpleName();

    private static final int DEPARTURE_ADDRESS_TEXT_FIELD_ID = R.id.add_journey_departure_addr_txt;
//    private static final int DESTINATION_ADDRESS_TEXT_FIELD_ID = R.id.add_journey_destination_addr_txt;
//    private static final int START_TIME_FIELD_ID = R.id.add_journey_start_time;
//    private static final int TRIP_DURATION_FIELD_ID = R.id.add_journey_trip_duration;
//    private static final int PASSENGER_COUNT_FIELD_ID = R.id.add_journey_passenger_count;
//    private static final int WEATHER_FIELD_ID = R.id.add_journey_weather;
//    private static final int TEMPERATURE_FIELD_ID = R.id.add_journey_temperature;
    private static final int SUBMIT_BUTTON_ID = R.id.add_journey_submit_btn;

    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
//    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    @Rule
    public ActivityTestRule<AddJourneyActivity> addJourneyActivity = new ActivityTestRule<>(AddJourneyActivity.class);

    private JourneyRepository fakeJourneyRepository;

    @Before
    public void setup(){
        fakeJourneyRepository = new FakeJourneyRepositoryImpl();
        FakeJourneyStoreApplication.createViewModelFactoryForApplication(addJourneyActivity, fakeJourneyRepository);
    }

    // Assert UI elements are displayed.
    @Test
    public void departureAddress_shouldBeDisplayed(){
        onView(withId(DEPARTURE_ADDRESS_TEXT_FIELD_ID))
                .check(matches(isDisplayed()));
    }

//    @Test
//    public void destinationAddress_shouldBeDisplayed(){
//        onView(withId(DESTINATION_ADDRESS_TEXT_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void startTimePicker_shouldBeDisplayed(){
//        onView(withId(START_TIME_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void tripDurationPicker_shouldBeDisplayed(){
//        onView(withId(TRIP_DURATION_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void passengerCount_shouldBeDisplayed(){
//        onView(withId(PASSENGER_COUNT_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void weatherDropdown_shouldBeDisplayed(){
//        onView(withId(WEATHER_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void temperatureField_shouldBeDisplayed(){
//        onView(withId(TEMPERATURE_FIELD_ID))
//                .check(matches(isDisplayed()));
//    }

    @Test
    public void submitButton_shouldBeDisplayed(){
        onView(withId(SUBMIT_BUTTON_ID))
                .check(matches(isDisplayed()));
    }


    // UI Tests
    @Test
    public void addJourneyActivity_givenAllJourneyDetails_onRotation_shouldPersistInputFields(){
        onView(withId(DEPARTURE_ADDRESS_TEXT_FIELD_ID))
                .perform(typeText(departureLocationToBeTyped));

        addJourneyActivity.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        onView(withId(DEPARTURE_ADDRESS_TEXT_FIELD_ID))
                .check(matches(withText(departureLocationToBeTyped)));
    }

    @Test
    public void submitButton_givenNoJourneyDetails_onClick_shouldDisplayErrors(){
        String departureAddressTextErrorMessage = addJourneyActivity.getActivity().getResources().getString(R.string.add_journey_required_field_error);

        onView(withId(SUBMIT_BUTTON_ID))
                .perform(click());

        onView(withId(DEPARTURE_ADDRESS_TEXT_FIELD_ID))
                .check(matches(hasErrorText(departureAddressTextErrorMessage)));
    }

    @Test
    public void submitButton_givenAllJourneyDetails_onClick_shouldAddJourneyToRepository(){
        Journey journeyToMatch = new Journey(departureLocationToBeTyped);

        onView(withId(DEPARTURE_ADDRESS_TEXT_FIELD_ID))
                .perform(typeText(departureLocationToBeTyped), closeSoftKeyboard());

        onView(withId(SUBMIT_BUTTON_ID))
                .perform(click());

        assertThat(fakeJourneyRepository.getJourneys().getValue(), hasItem(journeyToMatch));
    }
}