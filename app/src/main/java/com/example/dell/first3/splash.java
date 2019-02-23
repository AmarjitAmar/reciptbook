package com.example.dell.first3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread ad= new Thread()
        {
        public  void run()
        {
            try
            {
                Thread.sleep(4000);
            }
            catch(InterruptedException e)
            {

            }
            finally {
                Intent asd=new Intent(splash.this,Spl.class);
                startActivity(asd);
                finish();
            }
        }};
        ad.start();
    }
    }
