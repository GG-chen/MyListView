package com.example.administrator.mylistview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import static com.example.administrator.mylistview.R.layout.item;

/**
 * Created by Administrator on 2016/8/15.
 */
public class MyAdapter extends MyCommonAdapter<String> {


    public MyAdapter(Context context, List<String> mList) {
        super(context, mList,R.layout.item);

    }

    @Override
    public void convert(ViewHolder holder, String s) {
        holder.setText(R.id.text, s);

    }

}

