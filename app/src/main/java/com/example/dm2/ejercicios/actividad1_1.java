package com.example.dm2.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class actividad1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1_1);
    }

    void verificar(View v)
    {
        EditText txt1=(EditText)findViewById(R.id.a11_ed2);
        EditText txt2=(EditText)findViewById(R.id.a11_ed1);
        Intent intent= new Intent(actividad1_1.this,actividad1_2.class);
        intent.putExtra("Nombre",txt2.getText().toString());
        intent.putExtra("Apellidos",txt1.getText().toString());
        startActivityForResult(intent,1234);
    }

    protected void onActivityResult(int requestCode, int resultCode,Intent data)
    {
        if(requestCode==1234 && resultCode==RESULT_OK)
        {
            String res=data.getExtras().getString("resultado");

                TextView txt=(TextView) findViewById(R.id.a11_txt3);
                txt.setText(txt.getText().toString()+" "+res);
        }
    }

    void exit(View v)
    {
        finish();
    }
}
