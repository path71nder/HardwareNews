package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar7Activity extends AppCompatActivity {

    private TextView tvkomentar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar7);

        tvkomentar7 = findViewById(R.id.tv_komentar7);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments7 = extras.getString("COMMENTER7_KEY");
            tvkomentar7.setText(koments7);
        }
    }
}
