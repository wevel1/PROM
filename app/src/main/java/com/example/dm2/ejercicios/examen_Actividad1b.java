package com.example.dm2.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class examen_Actividad1b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen__actividad1b);
        Intent intent=getIntent();
        String nombre=intent.getExtras().getString("nombre");
        String provincia=intent.getExtras().getString("provincia");
        String sexo=intent.getExtras().getString("sexo");
        String php=intent.getExtras().getString("php");
        String java=intent.getExtras().getString("java");
        String html=intent.getExtras().getString("html");
        String css=intent.getExtras().getString("css");
        TextView txt3=(TextView) findViewById(R.id.ex_e1b_txt3);
        txt3.setText(nombre);
        TextView txt5=(TextView) findViewById(R.id.ex_e1b_txt5);
        txt5.setText(provincia);
        if(sexo!=null) {
            TextView txt7 = (TextView) findViewById(R.id.ex_e1b_txt7);
            txt7.setText(sexo);
        }
        String conoci="";
        ArrayList<String>array=new ArrayList<String>();
        if(php!=null)
            array.add(php);
        if(html!=null)
            array.add(html);
        if(css!=null)
            array.add(css);
        if(java!=null)
            array.add(java);
        for(int i=0;i<array.size();i++)
        {
            conoci+=array.get(i);
            if(i!=array.size()-1)
                conoci+=",";
        }
        TextView txt9 = (TextView) findViewById(R.id.ex_e1b_txt9);
        txt9.setText(conoci);
    }
    void aceptar(View v)
    {
        Intent intent=new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
    void rechazar(View v)
    {
        Intent intent=new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }
}
