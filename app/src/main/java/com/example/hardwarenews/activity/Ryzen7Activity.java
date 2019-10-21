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

public class Ryzen7Activity extends AppCompatActivity {

    public static final String COMMENTER8_KEY = "comment8";
    private EditText comment8Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryzen7);
        comment8Edit = findViewById(R.id.et_komen8);
    }

    public void ryzen7OnClicked(View view) {
        Intent ryzen7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amd.com/en/products/cpu/amd-ryzen-7-1800x"));
        startActivity(ryzen7);
    }

    public void comment8OnClick(View view) {
        String komen8 = comment8Edit.getText().toString();
        if (TextUtils.isEmpty(komen8)){
            Toast.makeText(this, "Mohon Masukkan Komentar anda", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent koment8Intent = new Intent(this, Komentar8Activity.class);
            koment8Intent.putExtra("COMMENTER8_KEY", komen8);
            startActivity(koment8Intent);
        }
    }
}
