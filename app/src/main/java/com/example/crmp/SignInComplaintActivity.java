package com.example.crmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInComplaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_complaint);

    }

    public void ComplaintStatusOnClick(View v) {
        Intent intent = new Intent(this, ComplaintStatusActivity.class);
        startActivity(intent);
    }
}