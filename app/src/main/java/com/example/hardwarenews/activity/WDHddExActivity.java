package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hardwarenews.R;

public class WDHddExActivity extends AppCompatActivity {

    public static final String COMMENTER10_KEY = "comment10";
    private EditText comment10Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdhdd_ex);
        comment10Edit = findViewById(R.id.et_komen10);
    }

    public void wdhddexOnClicked(View view) {
        Intent wdexInrent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shop.westerndigital.com/products/portable-drives/wd-my-passport-ultra-usb-c-hdd#WDBC3C0010BSL-WESN"));
        startActivity(wdexInrent);
    }

    public void comment10OnClick(View view) {
        String komen10 = comment10Edit.getText().toString();
        if (TextUtils.isEmpty(komen10)){
            Toast.makeText(this, "Mohon Masukkan Komentar anda", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent koment10Intent = new Intent(this, Komentar10Activity.class);
            koment10Intent.putExtra("COMMENTER10_KEY", komen10);
            startActivity(koment10Intent);
        }
    }
}
