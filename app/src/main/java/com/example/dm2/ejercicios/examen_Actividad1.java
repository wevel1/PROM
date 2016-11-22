package com.example.dm2.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class examen_Actividad1 extends AppCompatActivity {
    private Spinner cmbOpciones;
    private int candidatos=0;
    private int intentos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen__actividad1);
        cmbOpciones =(Spinner) findViewById(R.id.ex_e1_spinner);
        final String[] datos = new String[] {"Alava","Vizcaya","Guipuzcua"};
        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        TextView a=(TextView) findViewById(R.id.ex_e1_txt7);
        TextView b=(TextView) findViewById(R.id.ex_e1_txt9);
        int random=(int)(Math.random()*100+1);
        a.setText(String.valueOf(random));
        random=(int)(Math.random()*100+1);
        b.setText(String.valueOf(random));
    }
    void evaluar(View v)
    {
        EditText nombres=(EditText)findViewById(R.id.ex_e1_ed1);
        String nombre=nombres.getText().toString();
        Spinner provincias=(Spinner)findViewById(R.id.ex_e1_spinner);
        String provincia=(String)provincias.getSelectedItem();
        RadioButton radio1=(RadioButton) findViewById(R.id.ex_e1_radio1);
        RadioButton radio2=(RadioButton) findViewById(R.id.ex_e1_radio2);
        String sexo=null;
        if(radio1.isChecked())
        {
            sexo="masculino";
        }
        if(radio2.isChecked())
        {
            sexo="femenino";
        }
        CheckBox chk1=(CheckBox) findViewById(R.id.ex_e1_chk1);
        CheckBox chk2=(CheckBox) findViewById(R.id.ex_e1_chk2);
        CheckBox chk3=(CheckBox) findViewById(R.id.ex_e1_chk3);
        CheckBox chk4=(CheckBox) findViewById(R.id.ex_e1_chk4);
        boolean php=false;
        boolean java=false;
        boolean html=false;
        boolean css=false;
        if(chk1.isChecked())
            php=true;
        if(chk2.isChecked())
            java=true;
        if(chk3.isChecked())
            html=true;
        if(chk4.isChecked())
            css=true;
        EditText operacion=(EditText)findViewById(R.id.ex_e1_ed2);
        String oper=operacion.getText().toString();
        TextView a=(TextView) findViewById(R.id.ex_e1_txt7);
        TextView b=(TextView) findViewById(R.id.ex_e1_txt9);
        String num1=a.getText().toString();
        String num2=b.getText().toString();
        Boolean opebien=false;
        if((Integer.parseInt(num1)+Integer.parseInt(num2))==Integer.parseInt(oper))
            opebien=true;
        if(opebien==true) {
            if(nombre.isEmpty()==false) {
                Intent intent = new Intent(examen_Actividad1.this, examen_Actividad1b.class);
                intent.putExtra("nombre",nombre);
                intent.putExtra("provincia",provincia);
                if(sexo!=null)
                    intent.putExtra("sexo",sexo);
                if (php==true)
                    intent.putExtra("php","php");
                if (java==true)
                    intent.putExtra("java","java");
                if (html==true)
                    intent.putExtra("html","html");
                if (css==true)
                    intent.putExtra("css","css");
                startActivityForResult(intent, 1234);
            }
        }
        else
        {
            intentos++;
        }
        if(intentos==3)
        {
            Toast t=Toast.makeText(this,"La operacion ha sido resuelta incorrectamente 3 veces",Toast.LENGTH_SHORT);
            t.show();
            finish();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode,Intent data)
    {
        EditText nombres=(EditText)findViewById(R.id.ex_e1_ed1);
        nombres.setText("");
        Spinner provincias=(Spinner)findViewById(R.id.ex_e1_spinner);
        provincias.setSelection(0);
        RadioButton radio1=(RadioButton) findViewById(R.id.ex_e1_radio1);
        RadioButton radio2=(RadioButton) findViewById(R.id.ex_e1_radio2);
        radio1.setChecked(false);
        radio2.setChecked(false);
        CheckBox chk1=(CheckBox) findViewById(R.id.ex_e1_chk1);
        CheckBox chk2=(CheckBox) findViewById(R.id.ex_e1_chk2);
        CheckBox chk3=(CheckBox) findViewById(R.id.ex_e1_chk3);
        CheckBox chk4=(CheckBox) findViewById(R.id.ex_e1_chk4);
        chk1.setChecked(false);
        chk2.setChecked(false);
        chk3.setChecked(false);
        chk4.setChecked(false);
        TextView a=(TextView) findViewById(R.id.ex_e1_txt7);
        TextView b=(TextView) findViewById(R.id.ex_e1_txt9);
        int random=(int)(Math.random()*100+1);
        a.setText(String.valueOf(random));
        random=(int)(Math.random()*100+1);
        b.setText(String.valueOf(random));
        EditText operacion=(EditText)findViewById(R.id.ex_e1_ed2);
        operacion.setText("");
        if(requestCode==1234 && resultCode==RESULT_OK)
        {
            candidatos++;
            TextView txtcand=(TextView) findViewById(R.id.ex_e1_txt12);
            txtcand.setText(String.valueOf(candidatos));
            if(candidatos==4)
            {
                Button salir=(Button)findViewById(R.id.ex_e1_but2);
                salir.setVisibility(View.VISIBLE);
                Button evaluar=(Button)findViewById(R.id.ex_e1_but1);
                evaluar.setVisibility(View.INVISIBLE);
            }
        }
    }
    void salir(View v)
    {
        finish();
    }
}
