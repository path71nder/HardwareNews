package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class Komentar2Activity extends AppCompatActivity {

    private TextView tvkomentar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar2);

        tvkomentar2 = findViewById(R.id.tv_komentar2);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments2 = extras.getString("COMMENTER2_KEY");
            tvkomentar2.setText(koments2);
        }
    }
}
