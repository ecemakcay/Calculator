package com.ecemakcay.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

     EditText sayi1 ;
     EditText sayi2 ;
     TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sayi2 = (EditText) findViewById(R.id.sayi2);
        sayi1 = (EditText) findViewById(R.id.sayi1);
        result = (TextView) findViewById(R.id.result);
    }


    public void sum(View view){
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else {
            float sayi01= Float.parseFloat(sayi1.getText().toString());
            float sayi02= Float.parseFloat(sayi2.getText().toString());
            float sonuc= sayi01 + sayi02;
            DecimalFormat df=new DecimalFormat("#.##");
            result.setText("Result: " +df.format(sonuc) );
        }

    }

    public void deduct(View view){
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else {
            float sayi01= Float.parseFloat(sayi1.getText().toString());
            float sayi02= Float.parseFloat(sayi2.getText().toString());
            float sonuc= sayi01 - sayi02;
            DecimalFormat df=new DecimalFormat("#.##");
            result.setText("Result: " +df.format(sonuc) );
        }

    }

    public void divide(View view){
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else {
            float sayi01= Float.parseFloat(sayi1.getText().toString());
            float sayi02= Float.parseFloat(sayi2.getText().toString());
            float sonuc= sayi01 / sayi02;
            DecimalFormat df=new DecimalFormat("#.##");
            result.setText("Result: " +df.format(sonuc) );
        }

    }

    public void multiply(View view){
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else {
            float sayi01= Float.parseFloat(sayi1.getText().toString());
            float sayi02= Float.parseFloat(sayi2.getText().toString());
            float sonuc= sayi01 * sayi02;
            DecimalFormat df=new DecimalFormat("#.##");
            result.setText("Result: " +df.format(sonuc) );
        }

    }
}