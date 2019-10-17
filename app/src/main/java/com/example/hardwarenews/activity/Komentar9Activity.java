package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar9Activity extends AppCompatActivity {

    private TextView tvkomentar9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar9);

        tvkomentar9 = findViewById(R.id.tv_komentar9);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String koments9 = extras.getString("COMMENTER9_KEY");
            tvkomentar9.setText(koments9);
        }
    }
}
