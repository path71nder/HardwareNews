package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hardwarenews.R;

public class CorsairActivity extends AppCompatActivity {

    public static final String COMMENTER_KEY = "comment";
    private EditText commentEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsair);
        commentEdit = findViewById(R.id.et_komen);
    }

    public void corsairWebInClicked(View view) {
        Intent corsairIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.corsair.com/us/en/Categories/Products/Memory/Vengeance-PRO-RGB-Black/p/CMW16GX4M2C3200C16#tab-tech-specs"));
        startActivity(corsairIntent);
    }

    public void commentOnClick(View view) {
        String komen = commentEdit.getText().toString();
        Intent komenIntent = new Intent(this, KomentarActivity.class);
        komenIntent.putExtra("COMMENTER_KEY", komen);
        startActivity(komenIntent);
    }
}
