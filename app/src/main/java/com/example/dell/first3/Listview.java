package com.example.dell.first3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Listview extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView L1;
    String ar[]={" Kaju Matar Masala Recipe"," Lahori Paneer Kofta Recipe ","Feta Rice Stuffed Tomatoes Recipe ","Raw Mango Curry Recipe",

            "Sarson ka Saag Recipe","Papaya Barfi Recipe","Upma Fritters Recipe","Spicy Paneer Rolls Recipe","Jain Bread Cutlet Recipe"
    ,"Cheesy Masala Rice Balls Recipe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        L1=(ListView)findViewById(R.id.List);
        ArrayAdapter ad=new ArrayAdapter(this,R.layout.text,ar);
        L1.setAdapter(ad);
        L1.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i)
        {
            case 0:
                Intent it=new Intent(this,KajuMatar.class);
                startActivity(it);
                break;
            case 1:
                Intent a=new Intent(this ,LahoriPaneer.class);
                startActivity(a);
                break;
            case 2:
                Intent b=new Intent(this ,Fetarice.class);
                startActivity(b);
                break;
            case 3:
                Intent c=new Intent(this ,Rawmango.class);
                startActivity(c);
                break;
            case 4:
                Intent d=new Intent(this ,Sarsonsaag.class);
                startActivity(d);
                break;
            case 5:
                Intent e=new Intent(this ,Papayabarfi.class);
                startActivity(e);
                break;
            case 6:
                Intent f=new Intent(this ,Upma.class);
                startActivity(f);
                break;
            case 7:
                Intent g=new Intent(this ,Spicypanner.class);
                startActivity(g);
                break;
            case 8:
                Intent h=new Intent(this ,Jainbread.class);
                startActivity(h);
                break;
            case 9:
                Intent j=new Intent(this ,Chessymasala.class);
                startActivity(j);
                break;
        }

    }


    }

