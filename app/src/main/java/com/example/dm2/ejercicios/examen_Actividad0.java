package com.example.dm2.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class examen_Actividad0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_actividad0);
    }
    void acti1(View v)
    {
        Intent intent= new Intent(examen_Actividad0.this,examen_Actividad1.class);
        startActivity(intent);
    }
    void acti2(View v)
    {

    }
    void acti3(View v)
    {
        Toast t=Toast.makeText(this,"@string/ex_e0_but3toast",Toast.LENGTH_SHORT);
        t.show();
    }
    void exit(View v)
    {
        finish();
    }
}
