package com.example.pennapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button bLogin;
    TextView RegisterLink;
    EditText etUsername;
    EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        RegisterLink = (TextView) findViewById(R.id.RegisterLink);

        bLogin.setOnClickListener(this);
        RegisterLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogin:
                break;
            case R.id.RegisterLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
