package com.example.dm2.ejercicios;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;

public class layout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }

    void fondo(View v)
    {
        Button but=(Button)v;
        RelativeLayout rlayout=(RelativeLayout)findViewById(R.id.l3_layout1);
        if(but.getText().toString().equals("Encender")==false)
        {
            rlayout.setBackgroundColor(Color.GRAY);
        }
        else
        {
            rlayout.setBackgroundColor(Color.YELLOW);
        }
    }
}
