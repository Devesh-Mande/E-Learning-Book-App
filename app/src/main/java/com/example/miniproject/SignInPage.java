package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInPage extends AppCompatActivity {
    Button english,science,maths;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);
        description=(TextView)findViewById(R.id.textView);
        english=(Button)findViewById(R.id.button5);
        description.setText("WELCOME USER YOU CANE READ ABOUT OVERVIEW OF SUBJECTS BY CLICKING BUTTONS");
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       Intent i2=new Intent(SignInPage.this,English.class);
                       startActivity(i2);
            }
        });

        science=(Button)findViewById(R.id.button6);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(SignInPage.this,Science.class);
                startActivity(i3);
            }
        });
        maths=(Button)findViewById(R.id.button7);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(SignInPage.this,Maths.class);
                startActivity(i4);
            }
        });
    }
}