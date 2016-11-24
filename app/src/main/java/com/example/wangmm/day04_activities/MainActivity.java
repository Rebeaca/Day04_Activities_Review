package com.example.wangmm.day04_activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wangmm.day04_activities.utils.Contants;

/*
* 多界面
* -----健壮性，工具类的编写
* */
public class MainActivity extends AppCompatActivity {
    private Button bt_1,bt_2,bt_3,bt_4,bt_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        bt_1= (Button) findViewById(R.id.button1);
        bt_2= (Button) findViewById(R.id.button2);
        bt_3= (Button) findViewById(R.id.button3);
        bt_4= (Button) findViewById(R.id.button4);
        bt_5= (Button) findViewById(R.id.button5);

        //设置监听事件
        bt_1.setOnClickListener(new ButtonLitener());
        bt_2.setOnClickListener(new ButtonLitener());
        bt_3.setOnClickListener(new ButtonLitener());
        bt_4.setOnClickListener(new ButtonLitener());
        bt_5.setOnClickListener(new ButtonLitener());

    }
    public class ButtonLitener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button1:
                    See_null();
                    break;
                case R.id.button2:
                    See_number();
                    break;
                case R.id.button3:
                    Sys_CALL();
                    break;
                case R.id.button4:
                    Sys_SEND_MS();
                    break;
                case R.id.button5:
                    DIFF_App();
                    break;
            }
        }

        private void DIFF_App() {
            //跨应用调用--清单文件--name[自己命名],category[DEFAULT]
            Intent intent=new Intent();
          //  intent.setClass(MainActivity.this,layout_diff_app.class);
            intent.setAction("jm4");
            startActivity(intent);
        }

        private void Sys_SEND_MS() {
            //隐式意图-----发短信
//            Uri tomes=Uri.parse("smsto:15732612173");
//            Intent intent=new Intent(Intent.ACTION_SENDTO,tomes);
//            intent.putExtra(Contants.KEY_SMS,"你好漂亮");
//            startActivity(intent);
            Uri smsToUri = Uri.parse("smsto:10000");
            Intent intent = new Intent(Intent.ACTION_SENDTO, smsToUri);
            intent.putExtra("sms_body", "测试发送短信");
            startActivity(intent);
        }

        private void Sys_CALL() {
            //隐式意图-----打电话
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:15732612173"));
            startActivity(intent);
            //添加权限,清单文件
            //要与application同级别
        }

        private void See_number() {
            //界面跳转-----传参
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,layout_3.class);
           // intent.putExtra(Contants.KEY_X,"你好漂亮");
            intent.putExtra("name","摄入量");
            startActivity(intent);

        }

        private void See_null() {
            //界面跳转----无参
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,layout_2.class);

            startActivity(intent);
        }
    }

}
