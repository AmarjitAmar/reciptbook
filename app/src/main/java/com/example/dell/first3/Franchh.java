package com.example.dell.first3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Franchh extends AppCompatActivity {
    ListView l2;
    String ap[]={"nvdjknvjd","bdcbjbcj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franchh);
        l2=(ListView)findViewById(R.id.fr);
        ArrayAdapter aa=new ArrayAdapter(this,R.layout.text,ap);
        l2.setAdapter(aa);
    }
}
