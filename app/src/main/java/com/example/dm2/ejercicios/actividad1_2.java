package com.example.dm2.ejercicios;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class actividad1_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1_2);
        Intent intent=getIntent();
        String nom = intent.getExtras().getString("Nombre");
        String ape = intent.getExtras().getString("Apellidos");
        TextView txt=(TextView) findViewById(R.id.a12_txt1);
        txt.setText("Hola "+nom+" "+ape+" ¿Aceptas las condiciones?");
    }

    void aceptar(View v)
    {
        Intent intent=new Intent();
        intent.putExtra("resultado","aceptadas");
        setResult(RESULT_OK,intent);
        finish();
    }

    void rechazar(View v)
    {
        Intent intent=new Intent();
        intent.putExtra("resultado","rechazadas");
        setResult(RESULT_OK,intent);
        finish();
    }

}
