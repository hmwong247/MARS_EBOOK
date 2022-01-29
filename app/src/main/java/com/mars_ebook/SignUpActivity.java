package com.mars_ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Button signUpButton;
    private Button loginButton;
    private EditText username;
    private EditText password;
    private EditText school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpButton=(Button)findViewById(R.id.signupButton);
        loginButton=(Button)findViewById(R.id.loginButton);
        username=(EditText)findViewById(R.id.editTextEmail);
        password=(EditText)findViewById(R.id.editTextPassword);
        school=(EditText)findViewById(R.id.editTextSchool);
    }
}