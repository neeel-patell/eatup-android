package com.example.eatup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView logtosigntext=(TextView)findViewById(R.id.logtosignintxt);
        TextView forgetpassword=(TextView)findViewById(R.id.forgetpassword);
        Button loginbtn=(Button)findViewById(R.id.login_btn);



        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ForgetpasswordIntent=new Intent(Login.this,ForgetPasword.class);
                startActivity(ForgetpasswordIntent);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logtomain=new Intent(Login.this,Users_main.class);
                startActivity(logtomain);
            }
        });

        logtosigntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logtosigninintent=new Intent(Login.this,Signup.class);
                startActivity(logtosigninintent);
            }
        });


    }
}