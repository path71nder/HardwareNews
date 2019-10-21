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

public class RadeonActivity extends AppCompatActivity {

    public static final String COMMENTER7_KEY = "comment7";
    private EditText comment7Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radeon);
        comment7Edit = findViewById(R.id.et_komen7);
    }

    public void radeonWebOnCLicked(View view) {
        Intent radeonIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amd.com/en/products/cpu/amd-ryzen-7-1800x"));
        startActivity(radeonIntent);
    }

    public void comment7OnClick(View view) {
        String komen7 = comment7Edit.getText().toString();
        if (TextUtils.isEmpty(komen7)){
            Toast.makeText(this, "Mohon Masukkan Komentar anda", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent koment7Intent = new Intent(this, Komentar7Activity.class);
            koment7Intent.putExtra("COMMENTER7_KEY", komen7);
            startActivity(koment7Intent);
        }
    }
}
