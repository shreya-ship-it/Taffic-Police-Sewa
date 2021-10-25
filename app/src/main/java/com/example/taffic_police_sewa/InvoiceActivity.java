package com.example.taffic_police_sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvoiceActivity extends AppCompatActivity {

    private Button backtoend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        backtoend = findViewById(R.id.backtoend_button);

        backtoend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BACK TO END ACTIVITY
            }
        });
    }
}