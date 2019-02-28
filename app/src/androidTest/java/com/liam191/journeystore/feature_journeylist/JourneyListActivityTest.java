package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.Journey;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.filters.MediumTest;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.intent.Intents.*;
import static androidx.test.espresso.intent.matcher.IntentMatchers.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class JourneyListActivityTest {

    private static final String PROJECT_PACKAGE_NAME = "com.liam191.journeystore";
    private static final int JOURNEY_LIST = R.id.journey_list;

    @Rule
    public IntentsTestRule<JourneyListActivity> addJourneyActivity = new IntentsTestRule<>(JourneyListActivity.class);

    @Test
    public void addJourneyButton_whenClicked_shouldOpenAddJourneyActivity(){
        onView(withId(R.id.add_journey_btn))
                .perform(click());

        intended(toPackage(PROJECT_PACKAGE_NAME));
    }

    @Test
    public void journeyList_shouldBeDisplayed(){
        onView(withId(JOURNEY_LIST))
                .perform()
                .check(matches(isDisplayed()));
    }

//    @Test
//    public void journeyList_shouldContainJourneyCards(){
//        onData(allOf(is(instanceOf(Journey.class))))
//                .check(matches(isDisplayed()));
//    }
}
