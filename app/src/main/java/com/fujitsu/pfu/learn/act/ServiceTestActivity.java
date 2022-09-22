package com.fujitsu.pfu.learn.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.receiver.MyBRReceiver;
import com.fujitsu.pfu.learn.service.TestService1;

public class ServiceTestActivity extends AppCompatActivity {
    private final String TAG = "TestService1";
    private Button start;
    private Button stop;
    MyBRReceiver myBRReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_test);
        start = findViewById(R.id.btn_1);
        stop = findViewById(R.id.btn_2);

        Intent intent = new Intent(this, TestService1.class);

        start.setOnClickListener(v -> {
            Log.i(TAG, "start 按钮!");
            startService(intent);

        });

        stop.setOnClickListener(v -> {
            Log.i(TAG,"stop 按钮！");
            stopService(intent);

        });

        myBRReceiver = new MyBRReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(myBRReceiver,intentFilter);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myBRReceiver);
    }
}