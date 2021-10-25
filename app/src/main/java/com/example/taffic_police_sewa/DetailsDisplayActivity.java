package com.example.taffic_police_sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsDisplayActivity extends AppCompatActivity {

    private EditText eDLNumber;
    private EditText eRCNumber;
    private EditText ePlateNumber;
    private Button eGenerateChallan;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_display);

        for(i=0; i<n; i++){
            if(DLNumber.equals(eDLNumber) || RCNumber.equals(eRCNumber) || PlateNumber.equals(ePlateNumber)){
                //Details
            }
        }

        eGenerateChallan = findViewById(R.id.generatechallan_button);

        eGenerateChallan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NEW ACTIVITY
            }
        });
    }
}