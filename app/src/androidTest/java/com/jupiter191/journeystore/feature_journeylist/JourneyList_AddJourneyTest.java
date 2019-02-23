package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.R;
import com.jupiter191.journeystore.feature_journeylist.MockJourneyRepositoryComponent;
//import com.jupiter191.journeystore.repo.DaggerJourneyRepositoryComponent;
import com.jupiter191.journeystore.repo.DaggerJourneyRepositoryComponent;
import com.jupiter191.journeystore.repo.Journey;
import com.jupiter191.journeystore.repo.JourneyRepository;
import com.jupiter191.journeystore.repo.JourneyRepositoryModule;
import com.jupiter191.journeystore.repo.localStore.LocalJourneyStore;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

import javax.inject.Inject;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasEntry;


/*
* E2E - JourneyList - Add Journey
*
* This suite tests the add journey feature of the JourneyList activity.
* A user clicks the addJourney button, enters details of their journey
* and then adds this journey to the database.
* */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class JourneyList_AddJourneyTest {


//    private static final int ADD_JOURNEY_BUTTON_ID = R.id.add_journey_btn;
//    private static final int ADD_JOURNEY_DEPARTURE_TEXT_FIELD_ID = R.id.add_journey_departure_txt;
//    private static final int ADD_JOURNEY_DESTINATION_TEXT_FIELD_ID = R.id.add_journey_destination_txt;
//    private static final int ADD_JOURNEY_SUBMIT_BUTTON_ID = R.id.add_journey_submit_btn;

    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    JourneyRepository journeyRepository = DaggerJourneyRepositoryComponent
            .builder()
            .build()
            .getJourneyRepository();


    @Rule
    public ActivityTestRule<JourneyListActivity> journeyListActivity;

    @Before
    public void setup(){
        journeyListActivity = new ActivityTestRule(JourneyListActivity.class);

    }

    @Test
    public void addNewJourney(){
//        onView(withId(ADD_JOURNEY_BUTTON_ID)).perform(click());
//
//        onView(withId(ADD_JOURNEY_DEPARTURE_TEXT_FIELD_ID)).perform(typeText(departureLocationToBeTyped));
//        onView(withId(ADD_JOURNEY_DESTINATION_TEXT_FIELD_ID)).perform((typeText(destinationToBeTyped)));
//
//        onView(withId(ADD_JOURNEY_SUBMIT_BUTTON_ID)).perform(click());
//        assertThat(journeyRepository.getJourneys(), contains(new Journey()));

    }
}