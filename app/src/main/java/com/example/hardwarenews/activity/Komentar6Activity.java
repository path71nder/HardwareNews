package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

import java.util.PriorityQueue;

public class Komentar6Activity extends AppCompatActivity {

    private TextView tvkomentar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar6);

        tvkomentar6 = findViewById(R.id.tv_komentar6);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments6 = extras.getString("COMMENTER6_KEY");
            tvkomentar6.setText(koments6);
        }
    }
}
