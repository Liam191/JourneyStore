package com.liam191.journeystore.feature_addjourney;

import android.util.Log;

import com.liam191.journeystore.FakeJourneyStoreApplication;
import com.liam191.journeystore.FakeJourneyStoreViewModelFactory;
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
    private final String departureLocationToBeTyped = "123 Mock St, Departureville, Dublin, Ireland";
//    private final String destinationToBeTyped = "456 Mock Road, Destination Town, Dublin, Ireland";

    @Rule
    public ActivityTestRule<AddJourneyActivity> addJourneyActivity = new ActivityTestRule<>(AddJourneyActivity.class);

    private JourneyRepository fakeJourneyRepository;

    @Before
    public void setup(){
        fakeJourneyRepository = new FakeJourneyRepositoryImpl();
        FakeJourneyStoreViewModelFactory fakeViewModelFactory = new FakeJourneyStoreViewModelFactory(fakeJourneyRepository);
        ((FakeJourneyStoreApplication) addJourneyActivity.getActivity().getApplication()).setViewModelFactory(fakeViewModelFactory);
        Log.i(TAG, "Fake Application's getViewModelFactory() == "+ ((FakeJourneyStoreApplication) addJourneyActivity.getActivity().getApplication()).getViewModelFactory());
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
        Journey testJourney = new Journey(departureLocationToBeTyped);

        onView(withId(R.id.addjourney_departure_addr_txt))
                .perform(typeText(departureLocationToBeTyped), closeSoftKeyboard());

        onView(withId(R.id.addjourney_next_btn))
                .perform(click());

        assertThat(fakeJourneyRepository.getJourneys().getValue(), hasItem(is(testJourney)));
    }
}