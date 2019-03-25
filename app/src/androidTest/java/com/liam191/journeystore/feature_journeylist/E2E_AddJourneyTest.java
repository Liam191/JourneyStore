package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.FakeJourneyStoreApplication;
import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.FakeJourneyRepositoryImpl;
import com.liam191.journeystore.repo.JourneyRepository;
import com.liam191.journeystore.repo.JourneyRepositoryImpl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class E2E_AddJourneyTest {


    private static final int ADD_JOURNEY_BUTTON_ID = R.id.add_journey_btn;

    private static final int DEPARTURE_TEXT_FIELD_ID = R.id.add_journey_departure_txt;
    private static final int DESTINATION_TEXT_FIELD_ID = R.id.add_journey_destination_txt;
    private static final int START_TIME_FIELD_ID = R.id.add_journey_start_time;
    private static final int TRIP_DURATION_FIELD_ID = R.id.add_journey_trip_duration;
    private static final int PASSENGER_COUNT_FIELD_ID = R.id.add_journey_passenger_count;
    private static final int WEATHER_FIELD_ID = R.id.add_journey_weather;
    private static final int TEMPERATURE_FIELD_ID = R.id.add_journey_temperature;

    private static final int SUBMIT_BUTTON_ID = R.id.add_journey_submit_btn;

    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    private JourneyRepository journeyRepository;

    @Rule
    public ActivityTestRule<JourneyListActivity> journeyListActivity = new ActivityTestRule<>(JourneyListActivity.class);

    @Before
    public void setup(){
        // Use real JourneyRepository in E2E tests.
        JourneyRepository realJourneyRepository = new JourneyRepositoryImpl();
        FakeJourneyStoreApplication.createViewModelFactoryForApplication(journeyListActivity, realJourneyRepository);

    }

    @Test
    public void addNewJourney(){
        onView(withId(ADD_JOURNEY_BUTTON_ID)).perform(click());
//
//        onView(withId(DEPARTURE_TEXT_FIELD_ID)).perform(typeText(departureLocationToBeTyped));
//        onView(withId(DESTINATION_TEXT_FIELD_ID)).perform((typeText(destinationToBeTyped)));
//
//        onView(withId(SUBMIT_BUTTON_ID)).perform(click());
//        assertThat(journeyRepository.getJourneys(), hasItem(new Journey(1)));

    }
}