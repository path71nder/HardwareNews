package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hardwarenews.R;

public class PsuNewsActivity extends AppCompatActivity {

    public static final String COMMENTER6_KEY = "comment6";
    private EditText comment6Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psu_news);
        comment6Edit = findViewById(R.id.et_komen6);
    }

    public void comment6OnClick(View view) {
        String komen6 = comment6Edit.getText().toString();
        if (TextUtils.isEmpty(komen6)){
            Toast.makeText(this, "Mohon Masukkan Komentar anda", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent koment6Intent = new Intent(this, Komentar6Activity.class);
            koment6Intent.putExtra("COMMENTER6_KEY", komen6);
            startActivity(koment6Intent);
        }
    }
}
