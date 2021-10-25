package com.example.taffic_police_sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndActivity extends AppCompatActivity {

    private Button printinvoice;
    private Button backtodetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        printinvoice = findViewById(R.id.printinvoice_button);
        backtodetails = findViewById(R.id.backtodetails_button);

        printinvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NEWACTIVITY
            }
        });

        backtodetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BACK TO DETAILS ACTIVITY
            }
        });
    }
}