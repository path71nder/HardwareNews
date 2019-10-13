package com.example.hardwarenews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.activity.CaseActivity;
import com.example.hardwarenews.activity.CpuActivity;
import com.example.hardwarenews.activity.GpuActivity;
import com.example.hardwarenews.activity.HddActivity;
import com.example.hardwarenews.activity.MonitorActivity;
import com.example.hardwarenews.activity.PsuActivity;
import com.example.hardwarenews.activity.RamActivity;

public class AnyHardwareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_any_hardware);
    }

    public void cpuOnClicked(View view) {
        Intent cpuIntent = new Intent(this, CpuActivity.class);
        startActivity(cpuIntent);
    }

    public void ramOnClicked(View view) {
        Intent ramIntent = new Intent(this, RamActivity.class);
        startActivity(ramIntent);
    }

    public void hddOnClicked(View view) {
        Intent hddIntent = new Intent(this, HddActivity.class);
        startActivity(hddIntent);
    }

    public void gpuOnClicked(View view) {
        Intent gpuIntent = new Intent(this, GpuActivity.class);
        startActivity(gpuIntent);
    }

    public void psuOnClicked(View view) {
        Intent psuIntent = new Intent(this, PsuActivity.class);
        startActivity(psuIntent);
    }

    public void caseOnClicked(View view) {
        Intent caseIntent = new Intent(this, CaseActivity.class);
        startActivity(caseIntent);
    }

    public void monitorOnClicked(View view) {
        Intent monitorIntent = new Intent(this, MonitorActivity.class);
        startActivity(monitorIntent);
    }
}
