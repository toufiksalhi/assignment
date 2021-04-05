package com.ss.lamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText email_et,password_et;
    Spinner  Gender;
    Button save_btn;
    String email,password,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email_et=findViewById(R.id.email_et);
        password_et=findViewById(R.id.password_et);
        Gender=findViewById(R.id.spinner);
        save_btn=findViewById(R.id.save_btn);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.g,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gender.setAdapter(adapter);




        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email_et.getText().toString().isEmpty()){
                    email_et.setError("please enter your email ");
                    return;
                }
                if (password_et.getText().toString().isEmpty()){
                    password_et.setError("please enter your password ");
                    return;
                }
               int i= Gender.getSelectedItemPosition();
               if (i==0)
                   gender="male";
               else  gender="female";

               email=email_et.getText().toString();
               password=password_et.getText().toString();

                Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                intent.putExtra("gender",gender);
                startActivity(intent);
                finish();

            }
        });
    }
}