package com.yolo.user.muworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
public Button login;
    public void click(){
login=(Button)findViewById(R.id.bLogin);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent pogback = new Intent(LoginActivity.this,UserAreaActivity.class);
            startActivity(pogback);
        }
    });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        click();
        final EditText username=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);

        final TextView registerLink =(TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

        }
    });
}
}
