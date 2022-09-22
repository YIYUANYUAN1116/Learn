package com.fujitsu.pfu.learn.fragment;

import android.content.Context;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class NewItemFragment extends Fragment {
    /**
     * 声明一个接口，定义向activity传递的方法
     * 绑定的activity必须实现这个方法
     */
    public interface OnNewItemAddedListener {
        public void newItemAdded(String content);
    }
    private OnNewItemAddedListener onNewItemAddedListener;
    private Button btnAddItem;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            onNewItemAddedListener = (OnNewItemAddedListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString() + "must implement OnNewItemAddedListener");
        }
    }
}
