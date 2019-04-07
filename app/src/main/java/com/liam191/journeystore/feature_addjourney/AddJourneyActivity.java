package com.liam191.journeystore.feature_addjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.liam191.journeystore.JourneyStoreApplication;
import com.liam191.journeystore.R;
import com.liam191.journeystore.repo.Journey;

import static com.liam191.journeystore.utils.InputFieldUtil.*;

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

        departureTextField = findViewById(R.id.add_journey_departure_addr_txt);
        departureTextField.setText(addJourneyViewModel.getDepartureText());
    }

    private void saveJourneyDataToViewModel(){
//        addJourneyViewModel.setDepartureText(departureTextField.getText().toString());
    }

    public void onSubmit(View view) {
        if (isEmpty(departureTextField)) {
            departureTextField.setError(getResources().getString(R.string.add_journey_required_field_error));

        } else {
            saveJourneyDataToViewModel();
            addJourneyViewModel.addJourney();
        }
    }
}