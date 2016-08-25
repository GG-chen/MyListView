package com.example.administrator.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mLists ;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        mListView.setAdapter(new MyAdapter(MainActivity.this, mLists));

    }

    private void initData() {
        mLists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String list = i + "";
            mLists.add(list);
        }

    }

    private void initViews() {
        mListView = (ListView) findViewById(R.id.list_view);

    }
}
