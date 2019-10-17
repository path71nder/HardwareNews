package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hardwarenews.R;

public class SamsungSSDActivity extends AppCompatActivity {

    public static final String COMMENTER9_KEY = "comment9";
    private EditText comment9Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_ssd);
        comment9Edit = findViewById(R.id.et_komen9);
    }

    public void samsungssdOnClicked(View view) {
        Intent samsungssdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/id/memory-storage/850-pro-sata-3-2-5-inch-ssd/MZ-7KE1T0BW/"));
        startActivity(samsungssdIntent);
    }

    public void comment9OnClick(View view) {
        String komen9 = comment9Edit.getText().toString();
        Intent koment9Intent = new Intent(this, Komentar9Activity.class);
        koment9Intent.putExtra("COMMENTER9_KEY", komen9);
        startActivity(koment9Intent);
    }
}
