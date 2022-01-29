package com.mars_ebook;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(),
                        password.getText().toString());
            }
        });
    }

    private void validate(String username, String pw){
        if((username.equals("test"))&&(pw.equals("test"))){
            Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
            Intent intent =new Intent(loginActivity.this,accountActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Login fail",Toast.LENGTH_LONG).show();
        }

    }
}
