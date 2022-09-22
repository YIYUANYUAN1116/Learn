package com.fujitsu.pfu.learn.service;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class CalIntentService extends IntentService {

    private static final String TAG = "rustApp";
    private int mStartId = 0;

    /**
     * 一定要一个无参构造器
     */
    public CalIntentService() {
        super("cal_intent_service_name");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
