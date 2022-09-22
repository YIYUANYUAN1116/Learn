package com.fujitsu.pfu.learn.drawerlayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fujitsu.pfu.learn.R;

public class ContentFragment extends Fragment {

    private TextView tv_content;
    private String strContent;
    private Integer bgColor;

    public ContentFragment(String strContent,Integer bgColor) {
        this.strContent = strContent;
        this.bgColor = bgColor;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content, container, false);
        tv_content = view.findViewById(R.id.tv_content);
        String text = getArguments().getString("text");
        tv_content.setText(text);

        return view;
    }
}
