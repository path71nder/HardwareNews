package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class CorsairCarbideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsair_carbide);
    }


    public void carbideOnClicked(View view) {
        Intent carbide = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.corsair.com/ww/en/carbide-275r-case"));
        startActivity(carbide);
    }
}
