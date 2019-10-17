package com.example.hardwarenews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hardwarenews.R;

public class HyperXActivity extends AppCompatActivity {

    public static final String COMMENTER4_KEY = "comment4";
    public EditText comment4Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyper_x);
        comment4Edit = findViewById(R.id.et_komen4);
    }

    public void hyperXOnWebClicked(View view) {
        Intent hyperx = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hyperxgaming.com/us/memory/predator-ddr4#specifications"));
        startActivity(hyperx);
    }

    public void comment4OnClicked(View view) {
        String komen4 = comment4Edit.getText().toString();
        Intent komen4Intent = new Intent(this, Komentar4Activity.class);
        komen4Intent.putExtra("COMMENTER3_KEY", komen4);
        startActivity(komen4Intent);
    }
}
