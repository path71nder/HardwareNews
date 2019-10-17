package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hardwarenews.R;

public class I7Activity extends AppCompatActivity {

    public static final String COMMENTER5_KEY = "comment5";
    private EditText comment5Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i7);
        comment5Edit = findViewById(R.id.et_komen5);
    }

    public void i7WebOnclicked(View view) {
        Intent i7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hyperxgaming.com/us/memory/predator-ddr4#specifications\n"));
        startActivity(i7Intent);
    }

    public void comment5OnClick(View view) {
        String komen5 = comment5Edit.getText().toString();
        Intent komen5Intent = new Intent(this, Komentar5Activity.class);
        komen5Intent.putExtra("COMMENTER5_KEY", komen5);
        startActivity(komen5Intent);
    }
}
