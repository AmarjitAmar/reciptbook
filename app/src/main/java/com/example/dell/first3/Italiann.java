package com.example.dell.first3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Italiann extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView l3;
    String su[] = {"Gnocchi With Sausage and Spinach", "Spicy Linguine With Clams", "Three-Cheese Calzones", "Rustic Pork Ragu:pasta", "Spicy Cherry Tomatoes",
            "Cauliflower Toss-Up", "Balsamic Berries", "Chocolate-Banana Melts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italiann);
        l3 = (ListView) findViewById(R.id.ita);
        ArrayAdapter ap = new ArrayAdapter(this, R.layout.text, su);
        l3.setAdapter(ap);
        l3.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0:
                Intent ne = new Intent(this, Grochiwith.class);
                startActivity(ne);
                break;
            case 1:
                Intent nf=new Intent(this,Spicyling.class);
                startActivity(nf);
                break;
            case 2:
                Intent ng=new Intent(this,Threechessy.class);
                startActivity(ng);
                break;
            case 3:
                Intent nh=new Intent(this,Rusticpork.class);
                startActivity(nh);
                break;
            case 4:
                Intent ni=new Intent(this,Spicycherrytomatoes.class);
                startActivity(ni);
                break;
            case 5:
                Intent nj=new Intent(this,Rusticpork.class);
                startActivity(nj);
                break;
            case 6:
                Intent nk=new Intent(this,Balsamicberries.class);
                startActivity(nk);
                break;
            case 7:
                Intent nl=new Intent(this,Chocolatebananamelts.class);
                startActivity(nl);
                break;
            case 8:
                Intent nm=new Intent(this,Chocolatebananamelts.class);
                startActivity(nm);
                break;

        }
    }
}
