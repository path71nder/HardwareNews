package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hardwarenews.R;

public class GTXActivity extends AppCompatActivity {

    public static final String COMMENTER3_KEY = "comment3";
    private EditText comment3Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gtx);
        comment3Edit = findViewById(R.id.et_komen3);
    }

    public void Gtx1060webInClicked(View view) {
        Intent gtx1060Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asus.com/Graphics-Cards/GTX1060-O6G-9GBPS/"));
        startActivity(gtx1060Intent);
    }

    public void comment3OnClick(View view) {
        String komen3 = comment3Edit.getText().toString();
        if (TextUtils.isEmpty(komen3)){
            Toast.makeText(this, "Mohon Masukkan Komentar anda", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent komen3Intent = new Intent(this, Komentar3Activity.class);
            komen3Intent.putExtra("COMMENTER3_KEY", komen3);
            startActivity(komen3Intent);
        }
    }
}
