package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class Login extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login");

        button = (Button) findViewById(R.id.btnSignIn);
        editText = (EditText) findViewById(R.id.edtUser);
        editText = (EditText) findViewById(R.id.edtPassword);
        imageView = (ImageView) findViewById(R.id.imgLogin);

    }

    public void Onclick(View View){
        String button_text;
        button_text = ((Button)View).getText().toString();
        if(button_text.equals("Sign In"))
        {
            Intent Start_page = new Intent(this,HomePage.class);
            startActivity(Start_page);
        }
    }
}