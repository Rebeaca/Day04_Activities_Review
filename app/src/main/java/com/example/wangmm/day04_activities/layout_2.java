package com.example.wangmm.day04_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class layout_2 extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_2);
        Intent intent=getIntent();

        Toast.makeText(layout_2.this,intent.getStringExtra("name"), Toast.LENGTH_LONG).show();
        back= (Button) findViewById(R.id.button2_1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
