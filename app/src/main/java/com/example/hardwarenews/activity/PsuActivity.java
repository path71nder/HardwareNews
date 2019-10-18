package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class PsuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psu);
    }

    public void PsuNewsOnClicked(View view) {
        Intent psuNewsIntent = new Intent(this, PsuNewsActivity.class);
        startActivity(psuNewsIntent);
    }
}
