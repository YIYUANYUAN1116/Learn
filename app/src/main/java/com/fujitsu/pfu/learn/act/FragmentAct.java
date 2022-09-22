package com.fujitsu.pfu.learn.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.fragment.FirstFragment;
import com.fujitsu.pfu.learn.fragment.SecondFragment;

public class FragmentAct extends AppCompatActivity implements View.OnClickListener {

    private SecondFragment secondFragment;
    private FirstFragment firstFragment;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Button btn_switch = findViewById(R.id.btn_switch);
        btn_switch.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (count == 0){
            fragmentTransaction.replace(R.id.main_fragment_up, secondFragment);
            fragmentTransaction.replace(R.id.main_fragment_bottom, firstFragment);

            fragmentTransaction.commitNow();
            count++;
        }else if (count==1){
            fragmentTransaction.replace(R.id.main_fragment_up, firstFragment);
            fragmentTransaction.replace(R.id.main_fragment_bottom, secondFragment);

            fragmentTransaction.commitNow();
            count--;
        }

    }
}