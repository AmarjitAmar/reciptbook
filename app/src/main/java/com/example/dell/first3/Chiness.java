package com.example.dell.first3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.dell.first3.R.id.List;

public class Chiness extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView l1;
    String ar[]={"sgsfj","bdbdjb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiness);
        l1=(ListView)findViewById(R.id.listu);
        ArrayAdapter ap=new ArrayAdapter(this,R.layout.text,ar);
        l1.setAdapter(ap);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
    }

