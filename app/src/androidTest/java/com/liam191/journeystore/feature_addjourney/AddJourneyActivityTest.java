package com.liam191.journeystore.feature_addjourney;

import com.liam191.journeystore.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class AddJourneyActivityTest {

    @Rule
    public ActivityTestRule<AddJourneyActivity> addJourneyActivity = new ActivityTestRule<>(AddJourneyActivity.class);

    @Before
    public void setup(){

    }

    @Test
    public void departureAddress_shouldBeDisplayed(){
        onView(withId(R.id.departure_addr_txt))
                .check(matches(isDisplayed()));
    }

    @Test
    public void destinationAddress_shouldBeDisplayed(){
        onView(withId(R.id.destination_addr_txt))
                .check(matches(isDisplayed()));
    }

    @Test
    public void journeyDuration_shouldBeDisplayed(){
        onView(withId(R.id.duration_num))
                .check(matches(isDisplayed()));
    }

    @Test
    public void journeyStartTime_shouldBeDisplayed(){
        onView(withId(R.id.start_time))
                .check(matches(isDisplayed()));
    }

}