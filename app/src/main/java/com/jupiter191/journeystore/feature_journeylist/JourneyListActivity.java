package com.jupiter191.journeystore.feature_journeylist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.jupiter191.journeystore.R;
import com.jupiter191.journeystore.repo.JourneyRepository;

public class JourneyListActivity extends AppCompatActivity {

    JourneyRepository jr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_list);
    }
}
