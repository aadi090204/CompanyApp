package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Search extends AppCompatActivity {

    Button b4,b5;
    String s="searching for employee",s1="please enter employee code",s2;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);

        b4=(Button) findViewById(R.id.sub);
        b5=(Button) findViewById(R.id.backbt);
        e1=(EditText) findViewById(R.id.cd);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                s2=e1.getText().toString();
                if(s2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                }



            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6=new Intent(getApplicationContext(), Page2.class);
                startActivity(ob6);
            }
        });

    }
}