package com.dmt.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editEmail,editPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AnhXa();
        Login();
    }


    private void Login() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString().trim();
                String pass = editPass.getText().toString().trim();
                if(email.equals("") || email.length() <= 0 || email.isEmpty() || email==null){
                    Toast.makeText(MainActivity.this,"You Dom't Entered Your Email",Toast.LENGTH_SHORT).show();
                }
                if(pass.equals("") || pass.length() <= 0 || pass.isEmpty() || pass==null){
                    Toast.makeText(MainActivity.this,"You Dom't Password Your Email",Toast.LENGTH_SHORT).show();
                }
                if(email.length() <= 6 || pass.length() <= 4){
                    Toast.makeText(MainActivity.this,"wrong email or password",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this,goPage.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void AnhXa() {
        editEmail = (EditText) findViewById(R.id.editEmail);
        editPass = (EditText) findViewById(R.id.editPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
}