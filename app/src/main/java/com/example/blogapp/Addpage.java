package com.example.blogapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addpage extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addpage);
       e1=(EditText) findViewById(R.id.title);
       e2=(EditText) findViewById(R.id.desc);
       b1=(AppCompatButton) findViewById(R.id.gbbtn);
       b2=(AppCompatButton) findViewById(R.id.abtn);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(getApplicationContext(),LoggedIn.class);
               startActivity(i);
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String getTitle=e1.getText().toString();
               String getDesc=e2.getText().toString();
               Toast.makeText(getApplicationContext(),getTitle+" "+getDesc+" ",Toast.LENGTH_LONG).show();
           }
       });
    }
}