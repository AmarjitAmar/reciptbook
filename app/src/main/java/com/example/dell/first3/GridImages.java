package com.example.dell.first3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

import static android.view.Gravity.LEFT;
import static android.widget.ImageView.ScaleType.FIT_XY;

/**
 * Created by DELL on 7/14/2017.
 */

public class GridImages extends BaseAdapter {
    Context cm;
    int arr[]={R.drawable.indu,R.drawable.ch,R.drawable.fr,R.drawable.ital};
    String a[]={"Indian Food","Chiness Food","Franch Food","Italian Food"};
    public GridImages(Context c)
    {
        cm=c;
    }
    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater ly=(LayoutInflater)cm.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=ly.inflate(R.layout.makeit,null);
        TextView t1=(TextView)view.findViewById(R.id.textView2);
        ImageView i1=(ImageView)view.findViewById(R.id.imageView4);
        t1.setText(a[i]);
        i1.setImageResource(arr[i]);
        return view;
    }

}














































































































































































































