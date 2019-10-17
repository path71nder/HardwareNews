package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar4Activity extends AppCompatActivity {

    private TextView tvkomentar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar4);

        tvkomentar4 = findViewById(R.id.tv_komentar4);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments4 = extras.getString("COMMENTER4_KEY");
            tvkomentar4.setText(koments4);
        }
    }
}
