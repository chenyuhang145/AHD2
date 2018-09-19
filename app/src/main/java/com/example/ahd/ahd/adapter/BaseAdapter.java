package com.example.ahd.ahd.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class BaseAdapter<T> extends android.widget.BaseAdapter {

    private Context context;
    private LinkedList<T>list = new LinkedList<T>();
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        if(convertView==null){

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }


    static class ViewHolder {

    }
}
