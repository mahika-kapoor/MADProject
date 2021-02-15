package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Register");

        button = (Button) findViewById(R.id.btnLetsGo);
        editText = (EditText) findViewById(R.id.edtNewUser);
        editText = (EditText) findViewById(R.id.edtNewPass);
        imageView = (ImageView) findViewById(R.id.imgRegister);

    }
    public void Onclick(View View){
        String button_text;
        button_text = ((Button)View).getText().toString();
        if(button_text.equals("Lets go!"))
        {
            Intent Start_page = new Intent(this,HomePage.class);
            startActivity(Start_page);
        }
    }
}