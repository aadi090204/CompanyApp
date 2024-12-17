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

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    String s1,s2,s3="admin",s4="12345",s5="invalid creditionals";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.logbt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if (s1.equals(s3) && s2.equals(s4))
                {
                    Intent ob=new Intent(getApplicationContext(), Page2.class);
                    startActivity(ob);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),s5,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}