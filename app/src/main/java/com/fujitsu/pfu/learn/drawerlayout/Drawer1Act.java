package com.fujitsu.pfu.learn.drawerlayout;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.fujitsu.pfu.learn.R;

public class Drawer1Act extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_drawer1);

        DrawerLayout root = findViewById(R.id.root);
        final View contentView = findViewById(R.id.content_field);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,root, android.R.string.yes, android.R.string.cancel){

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                float slideX = drawerView.getWidth() * slideOffset;
                contentView.setTranslationX(slideX);
            }
        };
        root.addDrawerListener(actionBarDrawerToggle);

    }
}
