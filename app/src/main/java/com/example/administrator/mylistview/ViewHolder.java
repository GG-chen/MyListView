package com.example.administrator.mylistview;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/15.
 */
public class ViewHolder {
    TextView mTextView;
    private SparseArray<View> mViews;
    private View contextView;
    private int position;

    public View getContextView() {
        return contextView;
    }

    public ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.mViews = new SparseArray<View>();
        this.position = position;
        contextView = LayoutInflater.from(context).inflate(layoutId,parent);
        contextView.setTag(this);


    }
    public <T extends  View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = contextView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }
    public static ViewHolder get(Context context,View view , ViewGroup parent, int layoutId, int position) {
        if(view == null) {
           return new ViewHolder(context, parent, layoutId, position);
        }
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.position = position;
        return holder;
    }
    public ViewHolder setText(int viewId, String text) {
        TextView tv = (TextView) mViews.get(viewId);
        tv.setText(text);
        return  this;
    }
}
