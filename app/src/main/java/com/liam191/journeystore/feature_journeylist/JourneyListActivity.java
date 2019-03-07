package com.liam191.journeystore.feature_journeylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.liam191.journeystore.R;
import com.liam191.journeystore.feature_addjourney.AddJourneyActivity;

public class JourneyListActivity extends AppCompatActivity {

    private static final String TAG = JourneyListActivity.class.getSimpleName();
    private JourneyListViewModel journeyListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_list);
        journeyListViewModel = ViewModelProviders.of(this).get(JourneyListViewModel.class);
    }

    public void startAddJourneyActivity(View view){
        Intent addJourney = new Intent(this, AddJourneyActivity.class);
        startActivity(addJourney);
    }
}
