package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class SamsungSSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_ssd);
    }

    public void samsungssdOnClicked(View view) {
        Intent samsungssdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/id/memory-storage/850-pro-sata-3-2-5-inch-ssd/MZ-7KE1T0BW/"));
        startActivity(samsungssdIntent);
    }
}
