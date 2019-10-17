package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class I7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i7);
    }

    public void i7WebOnclicked(View view) {
        Intent i7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hyperxgaming.com/us/memory/predator-ddr4#specifications\n"));
        startActivity(i7Intent);
    }
}
