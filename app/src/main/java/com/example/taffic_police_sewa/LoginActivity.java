package com.example.taffic_police_sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button elogin;
    private TextView eattemptsinfo;

    private String Username = "user";
    private String Password = "pass";

    boolean isvalid = false;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eName = findViewById(R.id.EtName);
        ePassword = findViewById(R.id.etPassword);
        elogin = findViewById(R.id.Login_button);
        eattemptsinfo = findViewById(R.id.etAttemptsinfo);

        elogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(this, "Please enter all the details correctly.", Toast.LENGTH_SHORT).show();
                }else{
                    isvalid = validate(inputName, inputPassword);
                    if(!isvalid){
                        counter--;
                        Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
                        eattemptsinfo.setText("Number of attempts remaining: " + counter);
                        if(counter == 0) {
                            elogin.setEnabled(false);
                        }
                    }else{
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                        //NEW ACTIVITY
                    }
                }
            }
        });
    }

    private boolean validate(String Name, String Password){
        if(Name.equals(Username) && Password.equals(Password)){
            return true;
        }
        return false;
    }
}