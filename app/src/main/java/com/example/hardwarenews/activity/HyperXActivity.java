package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class HyperXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyper_x);
    }

    public void hyperXOnWebClicked(View view) {
        Intent hyperx = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hyperxgaming.com/us/memory/predator-ddr4#specifications"));
        startActivity(hyperx);
    }
}
