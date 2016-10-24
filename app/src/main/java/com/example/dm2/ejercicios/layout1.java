package com.example.dm2.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class layout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
    }
    void Sumar(View v)
    {
        EditText txt1=(EditText)findViewById(R.id.l1_edit1);
        EditText txt2=(EditText)findViewById(R.id.l1_edit2);
        int suma;
        suma=Integer.parseInt(txt1.getText().toString())+Integer.parseInt(txt2.getText().toString());
        TextView txtv=(TextView)findViewById(R.id.l1_lbl);
        txtv.setText(suma+"");
    }
}
