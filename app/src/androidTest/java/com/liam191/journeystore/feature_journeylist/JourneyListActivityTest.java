package com.liam191.journeystore.feature_journeylist;

import com.liam191.journeystore.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.filters.MediumTest;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.intent.Intents.*;
import static androidx.test.espresso.intent.matcher.IntentMatchers.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class JourneyListActivityTest {

    @Rule
    public IntentsTestRule<JourneyListActivity> addJourneyActivity = new IntentsTestRule<>(JourneyListActivity.class);

    @Test
    public void addJourneyButton_whenClicked_shouldOpenAddJourneyActivity(){
        onView(withId(R.id.add_journey_btn))
                .perform(click());

        intended(toPackage("com.liam191.journeylist"));
    }
}
