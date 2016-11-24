package com.example.wangmm.day04_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wangmm.day04_activities.utils.Contants;

public class layout_3 extends AppCompatActivity {
    private Button back;
    private TextView show_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3);
        show_3= (TextView) findViewById(R.id.textView3);
        back= (Button) findViewById(R.id.button2_1);
        //健壮性------工具类
        Intent intent=getIntent();
        String s=intent.getStringExtra("name");
        Toast.makeText(layout_3.this,"接受到数据"+s, Toast.LENGTH_LONG).show();
       // show_3.setText(s);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
