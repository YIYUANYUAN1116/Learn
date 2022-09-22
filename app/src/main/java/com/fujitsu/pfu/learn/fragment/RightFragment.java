package com.fujitsu.pfu.learn.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.fujitsu.pfu.learn.R;

public class RightFragment extends Fragment implements View.OnClickListener{

    private DrawerLayout drawer_layout;
    private FragmentManager fManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_right, container, false);
        view.findViewById(R.id.btn_one).setOnClickListener(this);
        view.findViewById(R.id.btn_two).setOnClickListener(this);
        view.findViewById(R.id.btn_three).setOnClickListener(this);
        fManager = getActivity().getSupportFragmentManager();
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                ContentFragment2 cFragment1 = new ContentFragment2("1.点击了右侧菜单项一",R.color.blue);
                fManager.beginTransaction().replace(R.id.fly_content,cFragment1).commit();
                drawer_layout.closeDrawer(GravityCompat.END);
                break;
            case R.id.btn_two:
                ContentFragment2 cFragment2 = new ContentFragment2("2.点击了右侧菜单项二",R.color.red);
                fManager.beginTransaction().replace(R.id.fly_content,cFragment2).commit();
                drawer_layout.closeDrawer(GravityCompat.END);
                break;
            case R.id.btn_three:
                ContentFragment2 cFragment3 = new ContentFragment2("3.点击了右侧菜单项三",R.color.yellow);
                fManager.beginTransaction().replace(R.id.fly_content,cFragment3).commit();
                drawer_layout.closeDrawer(GravityCompat.END);
                break;
        }
    }

    public void setDrawerLayout(DrawerLayout drawer_layout){
        this.drawer_layout = drawer_layout;
    }

}