package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar10Activity extends AppCompatActivity {

    private TextView tvkomentar10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar10);

        tvkomentar10 = findViewById(R.id.tv_komentar10);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String koments10 = extras.getString("COMMENTER10_KEY");
            tvkomentar10.setText(koments10);
        }
    }
}
