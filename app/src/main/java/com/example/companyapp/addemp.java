package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addemp extends AppCompatActivity {

        Button b7,b8;
        String ss="employee details recorded";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addemp);


        b7=(Button) findViewById(R.id.sub);
        b8=(Button) findViewById(R.id.backbt);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),ss,Toast.LENGTH_LONG).show();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob9 =new Intent(getApplicationContext(), Page2.class);
                startActivity(ob9);
            }
        });


    }
}