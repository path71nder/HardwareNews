package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class HddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdd);
    }

    public void SamsungSSDOnClicked(View view) {
        Intent samsungIntent = new Intent(this, SamsungSSDActivity.class);
        startActivity(samsungIntent);
    }

    public void WDHddExOnclicked(View view) {
        Intent wdWxIntent = new Intent(this, WDHddExActivity.class);
        startActivity(wdWxIntent);
    }
}
