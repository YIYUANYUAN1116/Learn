package com.fujitsu.pfu.learn.act;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.service.ForegroundService1;

public class ForegroundDemoAct extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreground_demo);

        Intent intent = new Intent(this, ForegroundService1.class);
        startForegroundService(intent);
    }
}