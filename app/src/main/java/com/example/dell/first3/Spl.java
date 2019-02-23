package com.example.dell.first3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.felipecsl.gifimageview.library.GifImageView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.apache.commons.io.IOUtil;

import java.io.InputStream;

public class Spl extends AppCompatActivity {
    private GifImageView gif;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spl);
        gif = (GifImageView) findViewById(R.id.gif);
        try {
            InputStream i = getAssets().open("heart.gif");
            byte[] bytes = IOUtil.toByteArray(i);
            gif.setBytes(bytes);
            gif.startAnimation();
        } catch (Exception e) {
        }
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Spl.this.startActivity(new Intent(Spl.this, Main2Activity.class));
                                          Spl.this.finish();
                                      }

                                  },

                5000);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Spl Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    /**
     * Created by DELL on 7/21/2017.
     */

    public static class Gridflavour extends BaseAdapter {
        Context cn;
        int ar[] = {R.drawable.indu, R.drawable.ch, R.drawable.fr, R.drawable.ital};
        String s[] = {"Indian Food", "Chiness Food", "Franch Food", "Italian Food"};

        public Gridflavour(Context c) {
            cn = c;
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
            LayoutInflater ly = (LayoutInflater) cn.getSystemService(LAYOUT_INFLATER_SERVICE);
            view=ly.inflate(R.layout.makeit, null);
            TextView t1 = (TextView) view.findViewById(R.id.textView);
            ImageView i1 = (ImageView) view.findViewById(R.id.imageView);
            t1.setText(s[i]);
            i1.setImageResource(ar[i]);
            return view;
        }
    }
}