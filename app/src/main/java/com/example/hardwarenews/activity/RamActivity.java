package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class RamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);
    }

    public void corsairOnClicked(View view) {
        Intent corsairIntent = new Intent(this, CorsairActivity.class);
        startActivity(corsairIntent);
    }

    public void hyperXOnClicked(View view) {
        Intent hyperXIntent = new Intent(this, HyperXActivity.class);
        startActivity(hyperXIntent);
    }
}
