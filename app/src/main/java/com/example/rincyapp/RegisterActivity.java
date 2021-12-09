package com.example.rincyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b1,b2;
    String getName,getaddress,getphno,getemail,getusername,getPassWord,getcpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.add);
        ed3=(EditText) findViewById(R.id.ph);
        ed4=(EditText) findViewById(R.id.email);
        ed5=(EditText) findViewById(R.id.user);
        ed6=(EditText) findViewById(R.id.pass);
        ed7=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton) findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.back_log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                getaddress=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getaddress,Toast.LENGTH_LONG).show();
                getphno=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getphno,Toast.LENGTH_LONG).show();
                getemail=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getemail,Toast.LENGTH_LONG).show();
                getusername=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_LONG).show();
                getPassWord=ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getPassWord,Toast.LENGTH_LONG).show();
                getcpass=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getcpass,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}