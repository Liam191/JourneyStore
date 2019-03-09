package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.R;
import com.liam191.journeystore.feature_journeydetails.JourneyDetailsActivity;
import com.liam191.journeystore.repo.DaggerFakeJourneyRepositoryComponent;
import com.liam191.journeystore.repo.FakeJourneyRepositoryComponent;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasEntry;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class E2E_JourneyList {

    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    private FakeJourneyRepositoryComponent fakeJourneyRepositoryComponent;

    @Rule
    public ActivityTestRule<JourneyListActivity> journeyListActivity = new ActivityTestRule<>(JourneyListActivity.class);

    @Rule
    public ActivityTestRule<JourneyDetailsActivity> journeyDetailsActivity = new ActivityTestRule<>(JourneyDetailsActivity.class);

    @Before
    public void setup(){
        // Using real repository with real underlying database for E2E tests.
        fakeJourneyRepositoryComponent = DaggerFakeJourneyRepositoryComponent
                .builder()
                .build();

        clearJourneyLocalDatabase();
    }

    private void clearJourneyLocalDatabase() {
//        LiveData<List<Journey>> journeyList = fakeJourneyRepositoryComponent.getJourneyRepository().getJourneys();
//        for(Journey journey : journeyList.getValue()){
////            fakeJourneyRepositoryComponent.getJourneyRepository().delete(journey.id());
//        }
    }


    @Test
    public void addNewJourney(){
        // JourneyListActivity
        onView(withId(R.id.add_journey_btn)).perform(click());
        // AddJourneyActivity
//        onView(withId(R.id.add_journey_departure_txt)).perform(typeText(departureLocationToBeTyped));
//        onView(withId(R.id.add_journey_destination_txt)).perform((typeText(destinationToBeTyped)));
//        // Add journey with above details.
//        onView(withId(R.id.add_journey_submit_btn)).perform(click());

        // JourneyListActivity
        // Check that the added journey is present in the journey list.
        onData(allOf(
                hasEntry(equalTo("departure"), is(departureLocationToBeTyped)),
                hasEntry(equalTo("destination"), is(destinationToBeTyped))
            )).check(matches(anything()));
    }

    @Test
    public void viewJourneyDetails(){
        // JourneyListActivity
        onData(allOf(
                hasEntry(equalTo("departure"), is(departureLocationToBeTyped)),
                hasEntry(equalTo("destination"), is(destinationToBeTyped))
        )).perform(click());

        // JourneyDetailsActivity
//        onView(withId(R.id.journey_departure_txt)).check(matches(withText(departureLocationToBeTyped)));
//        onView(withId(R.id.journey_destination_txt)).check(matches(withText(destinationToBeTyped)));
    }


    @After
    public void teardown(){
        clearJourneyLocalDatabase();
    }
}