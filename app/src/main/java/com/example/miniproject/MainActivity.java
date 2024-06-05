package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button signin,signup;
    EditText Etusername,Etpassword;
    SQLiteDatabase my_database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Etusername=(EditText)findViewById(R.id.editTextTextPersonName);
        Etpassword=(EditText)findViewById(R.id.editTextTextPassword);
        signin=(Button)findViewById(R.id.button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                my_database=openOrCreateDatabase("Student Database",MODE_PRIVATE,null);
                String S_user=Etusername.getText().toString();
                String S_pass=Etpassword.getText().toString();
                Cursor resultset=my_database.rawQuery("SELECT * from student_info",null);
                resultset.moveToFirst();
                String SUSER=resultset.getString(0);
                String SPASS=resultset.getString(1);
                if(SUSER.equals(S_user) && SPASS.equals(S_pass)) {
                    Toast.makeText(MainActivity.this, "SIGN IN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    Intent i2 = new Intent(MainActivity.this, SignInPage.class);
                    startActivity(i2);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "RETRY AGAIN SIGN IN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup=(Button)findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i= new Intent(MainActivity.this,SignUp.class);
                startActivity(i);

            }
        });

    }

}