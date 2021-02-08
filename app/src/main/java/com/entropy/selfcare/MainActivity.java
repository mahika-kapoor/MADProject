package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnLogin);
        button = (Button) findViewById(R.id.btnRegister);
        textView = (TextView) findViewById(R.id.txtHeading);
    }

    public void Onclick(View View){
        String button_text;
        button_text = ((Button)View).getText().toString();
        if(button_text.equals("Login"))
        {
            Intent Start_page = new Intent(this,Login.class);
            startActivity(Start_page);
        }
        else if(button_text.equals("Register")){
            Intent Start_page = new Intent(this,Register.class);
            startActivity(Start_page);
        }
    }

}

