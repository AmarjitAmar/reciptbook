package com.example.dell.first3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL on 7/22/2017.
 */

public class driconst extends BaseAdapter{
    Context cp;
int ar[]={R.drawable.affog,R.drawable.blendedbellinis,R.drawable.watermelon,R.drawable.kulfifalood,R.drawable.jamun,
        R.drawable.paanshots,R.drawable.broccolicappuccino,R.drawable.roastedgarlic,R.drawable.berrybeet,
        R.drawable.vanillachocolatemilk};
        String st[]={"Affogato with Orange","Blended Bellinis","Watermelon Agua Fresca","Kulfi Falooda Recipe",
                " Jamun Yogurt Slush Recipe","Paan Shots Recipe","Broccoli Cappuccino Recipe","Roasted Garlic and Potato Soup",
                "Berry Beet Smoothie","Vanilla Chocolate Milk Recipe "};
        public driconst(Context c)
        {
        cp=c;
        }

    @Override
    public int getCount() {
        return ar.length;
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
        LayoutInflater ly=(LayoutInflater)cp.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=ly.inflate(R.layout.help,null);
        TextView t1=(TextView)view.findViewById(R.id.tx);
        ImageView i1=(ImageView)view.findViewById(R.id.ig);
        t1.setText(st[i]);
        i1.setImageResource(ar[i]);
        return view;
    }
}
