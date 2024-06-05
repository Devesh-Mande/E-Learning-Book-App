package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button Submit,Reset;
    EditText Etusername,Etpassword,EtConfirmpass;
    DatabaseHandler dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Etusername=(EditText)findViewById(R.id.editTextTextPersonName2);
        Etpassword=(EditText)findViewById(R.id.editTextTextPersonName3);
        EtConfirmpass=(EditText)findViewById(R.id.editTextTextPersonName4);
        Submit=(Button)findViewById(R.id.button3);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=Etusername.getText().toString();
                String password=Etpassword.getText().toString();
                String confirmpass=EtConfirmpass.getText().toString();
                if(password.equals(confirmpass))
                {   dbh =new DatabaseHandler(SignUp.this);
                    dbh.opendb();
                    dbh.insertvalues(username,password,confirmpass);
                    dbh.closedb();
                    Toast.makeText(SignUp.this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SignUp.this, "PLEASE ENTER CORRECT PASSWORD ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Reset=(Button)findViewById(R.id.button4);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Etusername.setText(null);
                Etusername.setHint("ENTER USERNAME");
                Etpassword.setText(null);
                Etpassword.setHint("ENTER PASSWORD");
                EtConfirmpass.setText(null);
                EtConfirmpass.setHint("ENTER CONFIRM PASSWORD");
            }
        });
    }
}