package com.example.administrator.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/8/15.
 */
public abstract class MyCommonAdapter<T> extends BaseAdapter {
    protected List<T> mList;
    protected Context context;
    protected LayoutInflater mInflater;
    private int layoutId;


    public MyCommonAdapter(Context context, List<T> mList, int layoutId) {
        this.context = context;
        this.mList = mList;
        mInflater = LayoutInflater.from(context);
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public  View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder mViewHolder = ViewHolder.get(context, view,viewGroup,layoutId,i);
        convert(mViewHolder, getItem(i));
        return mViewHolder.getContextView();
    }
    public abstract void convert(ViewHolder holder, T t);

}

