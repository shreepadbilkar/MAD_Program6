package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mobile = findViewById(R.id.editTextTextPersonName);
        EditText textMessage = findViewById(R.id.editTextTextPersonName2);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(mobile.getText().toString(), null,
                            textMessage.getText().toString(), null, null);
                    Toast.makeText(MainActivity.this, "SMS send Successfully", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "SMS Failed to Send Please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}