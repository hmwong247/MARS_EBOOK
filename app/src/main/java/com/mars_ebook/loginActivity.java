package com.mars_ebook;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private Button loginButton ;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton=(Button)findViewById(R.id.loginButton);
        username=(EditText) findViewById(R.id.editTextEmail);
        password=(EditText) findViewById(R.id.editTextPassword);
    }

    private void validate(String username, String pw){
        if((username =="may")&&(pw == "123")){
            Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_SHORT).show();
            //Intent intent =new Intent(MainActivity.this,.class,Account.class);
            //startActivities(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Login fail",Toast.LENGTH_SHORT).show();
        }

    }
}
