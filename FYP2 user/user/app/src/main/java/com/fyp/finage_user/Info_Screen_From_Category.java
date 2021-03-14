package com.fyp.finage_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Info_Screen_From_Category extends AppCompatActivity {

    Spinner s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__screen__from__category);


        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");


        if(str1.equals("1"))
        {
            Toast.makeText(getApplicationContext(),"baby sitter",Toast.LENGTH_SHORT).show();
        }

        if(str1.equals("2"))
        {
            Toast.makeText(getApplicationContext(),"plumber",Toast.LENGTH_SHORT).show();
        }
        if(str1.equals("3"))
        {
            Toast.makeText(getApplicationContext(),"kitchening",Toast.LENGTH_SHORT).show();
        }
        if(str1.equals("4"))
        {
            Toast.makeText(getApplicationContext(),"Ironing",Toast.LENGTH_SHORT).show();
        }
        if(str1.equals("5"))
        {
            Toast.makeText(getApplicationContext(),"Cleaning",Toast.LENGTH_SHORT).show();
        }

        if(str1.equals("6"))
        {
            Toast.makeText(getApplicationContext(),"Home Shifting",Toast.LENGTH_SHORT).show();
        }

        s1= findViewById(R.id.firstspin);
        String[] items = new String[]{"1 hour", "2 hours", "3 hours","4 hours", "8 hours"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        s1.setAdapter(adapter);


        s2= findViewById(R.id.secondspin);
        String[] items2 = new String[]{"Male", "Female", "Anyone"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        s2.setAdapter(adapter2);




    }
}