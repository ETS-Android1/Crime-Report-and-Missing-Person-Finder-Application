package com.example.crmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginOnClick(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
    public void crimearoundOnClick(View c) {
        Intent intent = new Intent(this, CrimeAround.class);
        startActivity(intent);
    }
    public void missingPeopleOnClick(View c) {
        Intent intent = new Intent(this,MissingPeople.class);
        startActivity(intent);
    }

}