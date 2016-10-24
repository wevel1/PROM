package com.example.dm2.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }

    void operation_overlord(View v)
    {
        Button but=(Button)v;
        EditText ed1=(EditText)findViewById(R.id.l2_edit1);
        EditText ed2=(EditText)findViewById(R.id.l2_edit2);
        TextView lbl=(TextView)findViewById(R.id.l2_txt3);
        double result;
        switch (((Button) v).getText().toString())
        {
            case "+":
                result=Double.parseDouble(ed1.getText().toString())+Double.parseDouble(ed2.getText().toString());
                lbl.setText(result+"");
                break;
            case "-":
                result=Double.parseDouble(ed1.getText().toString())-Double.parseDouble(ed2.getText().toString());
                lbl.setText(result+"");
                break;
            case "*":
                result=Double.parseDouble(ed1.getText().toString())*Double.parseDouble(ed2.getText().toString());
                lbl.setText(result+"");
                break;
            case "/":
                result=Double.parseDouble(ed1.getText().toString())/Double.parseDouble(ed2.getText().toString());
                lbl.setText(result+"");
                break;
        }
    }
}
