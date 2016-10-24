package com.example.dm2.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class layout5 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout5);

        final Button button2 = (Button) findViewById(R.id.l5_but2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                ImageView img=(ImageView)findViewById(R.id.l5_img);
                img.setImageResource(R.mipmap.bing);
            }
        });

        final Button button3 = (Button) findViewById(R.id.l5_but3);
        button3.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        ImageView img=(ImageView)findViewById(R.id.l5_img);
        img.setImageResource(R.mipmap.chrome);
    }

    void Yahoo(View v)
    {
        ImageView img=(ImageView)findViewById(R.id.l5_img);
        img.setImageResource(R.mipmap.yahoo);
    }
}
