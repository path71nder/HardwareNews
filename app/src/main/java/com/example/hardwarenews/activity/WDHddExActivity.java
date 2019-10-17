package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hardwarenews.R;

public class WDHddExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdhdd_ex);
    }

    public void wdhddexOnClicked(View view) {
        Intent wdexInrent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shop.westerndigital.com/products/portable-drives/wd-my-passport-ultra-usb-c-hdd#WDBC3C0010BSL-WESN"));
        startActivity(wdexInrent);
    }
}
