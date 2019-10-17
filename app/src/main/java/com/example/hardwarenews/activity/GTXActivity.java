package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class GTXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gtx);
    }

    public void Gtx1060webInClicked(View view) {
        Intent gtx1060Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asus.com/Graphics-Cards/GTX1060-O6G-9GBPS/"));
        startActivity(gtx1060Intent);
    }
}
