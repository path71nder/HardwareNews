package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar5Activity extends AppCompatActivity {

    private TextView tvkomentar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar5);

        tvkomentar5 = findViewById(R.id.tv_komentar5);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments5 = extras.getString("COMMENTER5_KEY");
            tvkomentar5.setText(koments5);
        }
    }
}
