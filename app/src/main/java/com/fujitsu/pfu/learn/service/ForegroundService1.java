package com.fujitsu.pfu.learn.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.fujitsu.pfu.learn.MainActivity;
import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.act.ForegroundDemoAct;

public class ForegroundService1 extends Service {

    private final String TAG = "ForegroundService1";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind方法被调用!");
        return null;
    }

    //Service被创建时调用
    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate方法被调用!");
        super.onCreate();
        Notification.Builder localBuilder = new Notification.Builder(this);
        localBuilder.setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, ForegroundDemoAct.class), 0));
        localBuilder.setAutoCancel(false);
        localBuilder.setSmallIcon(R.mipmap.ic_launcher);
        localBuilder.setTicker("Foreground Service Start");
        localBuilder.setContentTitle("Socket服务端");
        localBuilder.setContentText("正在运行...");
        startForeground(1, localBuilder.getNotification());
    }

    //Service被启动时调用
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand方法被调用!");
        return super.onStartCommand(intent, flags, startId);
    }

    //Service被关闭之前回调
    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestory方法被调用!");
        super.onDestroy();
    }

}
