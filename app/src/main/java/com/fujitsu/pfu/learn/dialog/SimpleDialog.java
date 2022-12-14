package com.fujitsu.pfu.learn.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.fujitsu.pfu.learn.R;

public class SimpleDialog extends DialogFragment {
    public static final String K_TITLE = "k_title"; // 传输数据时用到的key
    public static final String K_CONTENT = "k_content";

    private String title;
    private String content;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments !=null){
            title = arguments.getString(K_TITLE);
            content = arguments.getString(K_CONTENT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_simple, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView titleTv = view.findViewById(R.id.title_tv);
        TextView contentTv = view.findViewById(R.id.content_tv);

        titleTv.setText(title);
        contentTv.setText(content);
    }
}
