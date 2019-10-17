package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar8Activity extends AppCompatActivity {

    private TextView tvkomentar8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar8);

        tvkomentar8 = findViewById(R.id.tv_komentar8);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments8 = extras.getString("COMMENTER8_KEY");
            tvkomentar8.setText(koments8);
        }
    }
}
