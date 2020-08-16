package com.mad_2020_g08.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1;
    EditText no2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.editNumber1);
        no2 = findViewById(R.id.editNumber2);
    }

     public void openSecondActivity(View view){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("n1", no1.getText().toString());
        intent.putExtra("n2", no2.getText().toString());

        //Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();
         //Creating the LayoutInflater instance
         LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
         View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                 findViewById(R.id.custom_toast_layout));


            //Creating the Toast object
         Toast toast = new Toast(getApplicationContext());
         toast.setDuration(Toast.LENGTH_SHORT);
         toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
         toast.setView(layout);//setting the view of custom toast layout
         toast.show();

        startActivity(intent);

     }
}