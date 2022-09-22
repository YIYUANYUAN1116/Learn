package com.fujitsu.pfu.learn.act;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.dialog.SimpleDialog;

public class SimpleDialogAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 调用
                popSimpleDialog1("欢迎访问", "欢迎访问https://an.rustfisher.com\n入门的好选择～");
            }
        });

    }


    private void popSimpleDialog1(String title, String content) {
        SimpleDialog dialog = new SimpleDialog();
        Bundle bundle = new Bundle();
        bundle.putString(SimpleDialog.K_TITLE,title);
        bundle.putString(SimpleDialog.K_CONTENT,content);
        dialog.setArguments(bundle);
        dialog.show(getSupportFragmentManager(),"one-tag");
    }
}
