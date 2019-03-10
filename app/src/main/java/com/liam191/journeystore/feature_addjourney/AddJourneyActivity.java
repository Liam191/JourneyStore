package com.liam191.journeystore.feature_addjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.liam191.journeystore.JourneyStoreApplication;
import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.Journey;

public class AddJourneyActivity extends AppCompatActivity {

    private static final String TAG = AddJourneyActivity.class.getSimpleName();

    private AddJourneyViewModel addJourneyViewModel;
    private EditText departureTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journey);

        JourneyStoreApplication app = (JourneyStoreApplication) getApplication();
        addJourneyViewModel = ViewModelProviders
                .of(this, app.getViewModelFactory())
                .get(AddJourneyViewModel.class);

        departureTextField = findViewById(R.id.addjourney_departure_addr_txt);
    }

    public void openMapRoutePickerActivity(View view){
        String departureText = departureTextField.getText().toString();

        Journey journeyToAdd = new Journey(departureText);
        addJourneyViewModel.addJourney(journeyToAdd);
    }
}
