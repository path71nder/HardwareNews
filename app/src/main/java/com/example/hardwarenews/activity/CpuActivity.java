package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class CpuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);
    }

    public void I7OnClicked(View view) {
        Intent core7Intent = new Intent(this, I7Activity.class);
        startActivity(core7Intent);
    }

    public void Ryzen7OnClicked(View view) {
        Intent ryzen7Intent = new Intent(this, Ryzen7Activity.class);
        startActivity(ryzen7Intent);
    }
}
