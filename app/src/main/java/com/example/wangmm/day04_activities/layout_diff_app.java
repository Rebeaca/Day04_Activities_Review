package com.example.wangmm.day04_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout_diff_app extends AppCompatActivity {
    private Button bt_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_diff_app);

        bt_home= (Button) findViewById(R.id.button4_1);

        bt_home.setOnClickListener(new ButtonListener());

    }
    public class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button4_1:
                    start_home();
                    break;


            }
        }

        private void start_home() {
            //返回主界面
            Intent intent=new Intent();
            intent.setAction("home");
            startActivity(intent);
        }

    }
}
