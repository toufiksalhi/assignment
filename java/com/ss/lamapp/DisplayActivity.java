package com.ss.lamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView email_tv,password_tv,gender_tv;

        email_tv=findViewById(R.id.email_tv);
        password_tv=findViewById(R.id.password_tv);
        gender_tv=findViewById(R.id.gender);

        String email= getIntent().getStringExtra("email");
        String password= getIntent().getStringExtra("password");
        String gender =getIntent().getStringExtra("gender");

        email_tv.setText(email);
        password_tv.setText(password);
        gender_tv.setText(gender);


    }
}