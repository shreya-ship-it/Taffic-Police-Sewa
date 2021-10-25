package com.example.taffic_police_sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    private EditText eDLNumber;
    private EditText eRCNumber;
    private EditText ePlateNumber;
    private Button efinddetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        eDLNumber = findViewById(R.id.etDLNumber);
        eRCNumber = findViewById(R.id.etRCNumber);
        ePlateNumber = findViewById(R.id.etPlateNumber);
        efinddetails = findViewById(R.id.etfinddetails);

        efinddetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputDLNumber = eDLNumber.getText().toString();
                String inputRCNumber = eRCNumber.getText().toString();
                String inputPlateNumber = ePlateNumber.getText().toString();

                if (inputDLNumber.isEmpty() && inputRCNumber.isEmpty() && inputPlateNumber.isEmpty()) {
                    Toast.makeText(this, "Please enter any one of the details.", Toast.LENGTH_SHORT).show();
                } else {
                    //NEW ACTIVITY
                }
            }
        });
    }
}