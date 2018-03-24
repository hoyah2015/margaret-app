package com.superconsult.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private Button btnReg;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnReg =  findViewById(R.id.buttonReg);
        btnLogin=findViewById(R.id.btnLogin);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Registration",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MenuActivity.this,RegistrationActivity.class));
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MenuActivity.this,LoginActivity.class));
            }
        });


    }
}
