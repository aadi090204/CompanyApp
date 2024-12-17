package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page2 extends AppCompatActivity {

    Button b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);

        b2=(Button) findViewById(R.id.aemp);
        b3=(Button) findViewById(R.id.semp);
        b4=(Button) findViewById(R.id.lout);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3=new Intent(getApplicationContext(), addemp.class);
                startActivity(ob3);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4=new Intent(getApplicationContext(), Search.class);
                startActivity(ob4);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob5=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob5);
            }
        });
    }
}