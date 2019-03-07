package com.liam191.journeystore.feature_addjourney;

import android.util.Log;

import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.DaggerFakeJourneyRepositoryComponent;
import com.liam191.journeystore.repo.JourneyRepositoryComponent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class AddJourneyActivityTest {

    private static final String TAG = AddJourneyActivityTest.class.getSimpleName();
    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    @Rule
    public ActivityTestRule<AddJourneyActivity> addJourneyActivity = new ActivityTestRule<>(AddJourneyActivity.class);
    private JourneyRepositoryComponent fakeJourneyRepositoryComponent;

    @Before
    public void setup(){
        fakeJourneyRepositoryComponent = DaggerFakeJourneyRepositoryComponent
                .builder()
                .build();
    }

    @Test
    public void departureAddress_shouldBeDisplayed(){
        onView(withId(R.id.addjourney_departure_addr_txt))
                .check(matches(isDisplayed()));
    }

//    @Test
//    public void destinationAddress_shouldBeDisplayed(){
//        onView(withId(R.id.destination_addr_txt))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void journeyDuration_shouldBeDisplayed(){
//        onView(withId(R.id.duration_num))
//                .check(matches(isDisplayed()));
//    }

//    @Test
//    public void journeyStartTime_shouldBeDisplayed(){
//        onView(withId(R.id.start_time))
//                .check(matches(isDisplayed()));
//    }

    @Test
    public void nextButton_shouldBeDisplayed(){
        onView(withId(R.id.addjourney_next_btn))
                .check(matches(isDisplayed()));
    }

    @Test
    public void nextButton_givenNoJourneyDetails_onClick_shouldDisplayErrors(){
        onView(withId(R.id.addjourney_departure_addr_txt))
                .perform(typeText(departureLocationToBeTyped));

        onView(withId(R.id.addjourney_next_btn))
                .perform(click());

        Log.e(TAG, fakeJourneyRepositoryComponent.getJourneyRepository().getJourneys().getValue().toString());
//        assertThat(fakeJourneyRepositoryComponent.getJourneyRepository().getJourneys().getValue(),
//                hasItem());
    }
}