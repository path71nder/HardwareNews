package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class GpuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpu);
    }

    public void Gtx1060OnClicked(View view) {
        Intent gtx1060Intent = new Intent(this, GTXActivity.class);
        startActivity(gtx1060Intent);
    }


    public void RadeonviiOnClicked(View view) {
        Intent radeonviiIntent = new Intent(this, RadeonActivity.class);
        startActivity(radeonviiIntent);
    }
}
