package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class CaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);
    }

    public void CorsairCarbideOnClicked(View view) {
        Intent carbideIntent = new Intent(this, CorsairCarbideActivity.class);
        startActivity(carbideIntent);
    }
}
