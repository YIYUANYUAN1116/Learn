package com.fujitsu.pfu.learn.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.service.TestService3;

public class TestServiceAct3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_service3);

        Intent intent1 = new Intent(this, TestService3.class);
        Bundle bundle1 = new Bundle();
        bundle1.putString("param","s1");
        intent1.putExtras(bundle1);

        Intent intent2 = new Intent(this, TestService3.class);
        Bundle bundle2 = new Bundle();
        bundle2.putString("param","s2");
        intent2.putExtras(bundle2);

        Intent intent3 = new Intent(this, TestService3.class);
        Bundle bundle3 = new Bundle();
        bundle3.putString("param","s3");
        intent3.putExtras(bundle3);

        startService(intent1);
        startService(intent2);
        startService(intent3);


    }
}