package com.fujitsu.pfu.learn.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBRReceiver2 extends BroadcastReceiver {

    private final String CHANGE_NET = "android.net.conn.CONNECTIVITY_CHANGE";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (CHANGE_NET.equals(intent.getAction()))
            Toast.makeText(context,"网络状态发生改变~",Toast.LENGTH_SHORT).show();
    }
}
