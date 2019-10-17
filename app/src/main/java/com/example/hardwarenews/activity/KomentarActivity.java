package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hardwarenews.R;

public class KomentarActivity extends AppCompatActivity {

    private TextView tvkomentar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar);

        tvkomentar = findViewById(R.id.tv_komentar);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String koments = extras.getString("COMMENTER_KEY");
            tvkomentar.setText(koments);
        }
    }
}
