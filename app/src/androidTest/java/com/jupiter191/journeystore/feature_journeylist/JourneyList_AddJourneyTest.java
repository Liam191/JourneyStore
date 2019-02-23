package com.jupiter191.journeystore.feature_journeylist;

//import com.jupiter191.journeystore.repo.DaggerJourneyRepositoryComponent;
import com.jupiter191.journeystore.repo.Journey;
import com.jupiter191.journeystore.repo.JourneyRepository;

        import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

        import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

        import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.hasItem;
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

    JourneyRepository journeyRepository;


    @Rule
    public ActivityTestRule<JourneyListActivity> journeyListActivity;

    @Before
    public void setup(){
        journeyListActivity = new ActivityTestRule(JourneyListActivity.class);
        journeyRepository = DaggerFakeJourneyRepositoryComponent
                .builder()
                .build()
                .getJourneyRepository();
    }

    @Test
    public void addNewJourney(){
//        onView(withId(ADD_JOURNEY_BUTTON_ID)).perform(click());
//
//        onView(withId(ADD_JOURNEY_DEPARTURE_TEXT_FIELD_ID)).perform(typeText(departureLocationToBeTyped));
//        onView(withId(ADD_JOURNEY_DESTINATION_TEXT_FIELD_ID)).perform((typeText(destinationToBeTyped)));
//
//        onView(withId(ADD_JOURNEY_SUBMIT_BUTTON_ID)).perform(click());
        assertThat(journeyRepository.getJourneys(), hasItem(new Journey(1)));

    }
}