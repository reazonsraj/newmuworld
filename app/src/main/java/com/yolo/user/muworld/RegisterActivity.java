package com.yolo.user.muworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etAge=(EditText)findViewById(R.id.etAge);
        final EditText etName=(EditText)findViewById(R.id.etName);
        final EditText etPassword=(EditText)findViewById(R.id.etPassword);
        final EditText etusername=(EditText)findViewById(R.id.etusername);
        final Button    bRegister =(Button)findViewById(R.id.bRegister);


    }
}
