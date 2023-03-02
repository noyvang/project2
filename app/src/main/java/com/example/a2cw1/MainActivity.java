package com.example.a2cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declare Mydatabase class as myDatabase
    MyDatabase myDatabase;
    Button buttonSignup,buttonUpdate;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call Mydatabase class to create database
        myDatabase = new MyDatabase(this);

        buttonSignup = findViewById(R.id.btnsignup);
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupInten = new Intent(MainActivity.this,SignUp.class);
                startActivity(signupInten);
            }
        });
        buttonUpdate = findViewById(R.id.btnlogin);
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateInten = new Intent(MainActivity.this,SignUp.class);
            }
        });
    }
}