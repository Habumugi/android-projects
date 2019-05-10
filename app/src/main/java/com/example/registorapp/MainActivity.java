package com.example.registorapp;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button LogIn;
    private Button Registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = (EditText) findViewById(R.id.mail);
        Password = (EditText) findViewById(R.id.pass);
        LogIn = (Button) findViewById(R.id.btnLog);
        Registration = (Button) findViewById(R.id.btnReg1);
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Welcome to registration page.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }

        });

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = Email.getText().toString();
                String pass = Password.getText().toString();

                if (TextUtils.isEmpty(user)) {
                    Toast.makeText(MainActivity.this, "Enter email..", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(MainActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }
                else if(user.equals("amis@gmail.com") && pass.equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "successful", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(MainActivity.this, com.example.registorapp.LogIn.class);
                    startActivity(loginIntent);
                }
                else
                    {
                        Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
                    }

            }
        });
    }
}

