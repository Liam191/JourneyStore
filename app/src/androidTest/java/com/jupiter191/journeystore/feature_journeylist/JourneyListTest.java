package com.jupiter191.journeystore.feature_journeylist;

import com.jupiter191.journeystore.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class JourneyListTest {

    @Rule
    public ActivityTestRule<JourneyListActivity> journeyListActivity = new ActivityTestRule(JourneyListActivity.class);

    @Test
    public void testJourneyListExistsAndIsVisible(){
        onView(withId(R.id.journey_list))
                .perform()  // Empty perform needed to avoid I/MonitoringInstr: Unstopped activity count: 1 error.
                .check(matches(isDisplayed()));
    }

    @Test
    public void testOneJourneyListItemExistsAndIsVisible(){
        onView(withId(R.id.journey_list_item))
                .perform()  // Empty perform needed to avoid I/MonitoringInstr: Unstopped activity count: 1 error.
                .check(matches(isDisplayed()));
    }
}