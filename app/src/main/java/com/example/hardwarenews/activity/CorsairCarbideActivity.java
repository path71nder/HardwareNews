package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hardwarenews.R;

public class CorsairCarbideActivity extends AppCompatActivity {

    public static final String COMMENTER2_KEY = "comment2";
    private EditText comment2Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsair_carbide);
        comment2Edit = findViewById(R.id.et_komen2);
    }

    public void carbideOnClicked(View view) {
        Intent carbide = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.corsair.com/ww/en/carbide-275r-case"));
        startActivity(carbide);
    }

    public void comment2OnClick(View view) {
        String komen2 = comment2Edit.getText().toString();
        Intent komen2Intent = new Intent(this, Komentar2Activity.class);
        komen2Intent.putExtra("COMMENTER2_KEY", komen2);
        startActivity(komen2Intent);
    }
}
