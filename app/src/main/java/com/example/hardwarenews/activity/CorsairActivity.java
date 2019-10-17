package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class CorsairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsair);
    }

    public void corsairWebInClicked(View view) {
        Intent corsairIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.corsair.com/us/en/Categories/Products/Memory/Vengeance-PRO-RGB-Black/p/CMW16GX4M2C3200C16#tab-tech-specs"));
        startActivity(corsairIntent);
    }
}
