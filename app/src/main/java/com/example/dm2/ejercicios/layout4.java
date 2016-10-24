package com.example.dm2.ejercicios;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class layout4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
    }
    void validateDNI(View v)
    {
        EditText e1=(EditText) findViewById(R.id.l4_edit1);
        EditText e2=(EditText) findViewById(R.id.l4_edit2);
        int rem;
        try {
            int num1 = Integer.parseInt(e1.getText().toString());
            char currentChar = e2.getText().toString().toUpperCase().charAt(0);
            rem=num1%23;
            char expectedChar=' ';
            switch (rem)
            {
                case 0:
                    expectedChar='T';
                    break;
                case 1:
                    expectedChar='R';
                    break;
                case 2:
                    expectedChar='W';
                    break;
                case 3:
                    expectedChar='A';
                    break;
                case 4:
                    expectedChar='G';
                    break;
                case 5:
                    expectedChar='M';
                    break;
                case 6:
                    expectedChar='Y';
                    break;
                case 7:
                    expectedChar='F';
                    break;
                case 8:
                    expectedChar='P';
                    break;
                case 9:
                    expectedChar='D';
                    break;
                case 10:
                    expectedChar='X';
                    break;
                case 11:
                    expectedChar='B';
                    break;
                case 12:
                    expectedChar='N';
                    break;
                case 13:
                    expectedChar='J';
                    break;
                case 14:
                    expectedChar='Z';
                    break;
                case 15:
                    expectedChar='S';
                    break;
                case 16:
                    expectedChar='Q';
                    break;
                case 17:
                    expectedChar='V';
                    break;
                case 18:
                    expectedChar='H';
                    break;
                case 19:
                    expectedChar='L';
                    break;
                case 20:
                    expectedChar='C';
                    break;
                case 21:
                    expectedChar='K';
                    break;
                case 22:
                    expectedChar='E';
                    break;
            }
            if(expectedChar==currentChar)
            {
                Toast.makeText(layout4.this, "DNI Correct", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(layout4.this, "DNI Not correct", Toast.LENGTH_SHORT).show();
            }
        }catch (NumberFormatException e)
        {

        }

    }
}
