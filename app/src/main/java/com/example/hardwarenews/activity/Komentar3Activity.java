package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar3Activity extends AppCompatActivity {

    private TextView tvkomentar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar3);

        tvkomentar3 = findViewById(R.id.tv_komentar3);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments3 = extras.getString("COMMENTER3_KEY");
            tvkomentar3.setText(koments3);
        }
    }
}
