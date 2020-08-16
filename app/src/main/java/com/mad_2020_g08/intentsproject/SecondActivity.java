package com.mad_2020_g08.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText no1;
    EditText no2;

    String number1;
    String number2;

    int n1,n2;

    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no1 = findViewById(R.id.setNumber1);
        no2 = findViewById(R.id.setTextNumber2);
        answer = findViewById(R.id.lbl);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

       no1.setText(number1);
       no2.setText(number2);

       n1 = Integer.parseInt(number1);
       n2 = Integer.parseInt(number2);

    }

    public void add(View view){

        answer.setText(number1 + " + " + number2 + " = " + (n1 + n2));

    }

    public void substraction(View view){

        answer.setText(number1 + " - " + number2 + " = " + (n1 - n2));

    }

    public void multiplication(View view){

        answer.setText(number1 + " * " + number2 + " = " + (n1 * n2));

    }

    public void devition(View view){

        answer.setText(number1 + " / " + number2 + " = " + (n1 / n2));

    }

}