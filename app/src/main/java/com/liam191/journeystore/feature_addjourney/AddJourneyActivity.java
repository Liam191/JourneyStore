package com.liam191.journeystore.feature_addjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.liam191.journeystore.R;

public class AddJourneyActivity extends AppCompatActivity {

    private static final String TAG = AddJourneyActivity.class.getSimpleName();
    private AddJourneyViewModel addJourneyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journey);
        addJourneyViewModel = ViewModelProviders.of(this).get(AddJourneyViewModel.class);
    }

    public void openMapRoutePickerActivity(View view){
        Log.i(TAG, view.toString());
    }
}
