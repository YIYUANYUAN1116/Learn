package com.fujitsu.pfu.learn.act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.fujitsu.pfu.learn.R;
import com.fujitsu.pfu.learn.fragment.ListStoreFragment;

import java.util.ArrayList;

public class ListStoreActivity extends AppCompatActivity {

    private ArrayList<String> data;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liststore);
        data = new ArrayList<String>();
        // 把data装入adapter中
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        // ListFragment并不需要再定义一个listview
//        ListStoreFragment listStoreFragment = (ListStoreFragment) getFragmentManager().findFragmentById(R.id.fragment_listview);
//        listStoreFragment.setListAdapter(adapter);
    }
}