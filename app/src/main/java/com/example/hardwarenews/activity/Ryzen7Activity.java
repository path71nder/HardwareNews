package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class Ryzen7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryzen7);
    }

    public void ryzen7OnClicked(View view) {
        Intent ryzen7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amd.com/en/products/cpu/amd-ryzen-7-1800x"));
        startActivity(ryzen7);
    }
}
