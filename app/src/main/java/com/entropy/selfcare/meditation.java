package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class meditation extends AppCompatActivity {
    /*LottieAnimationView medgirl;*/
   private Button mbutton1,mbutton2,mbutton3,mbutton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_meditation);
        /*medgirl = findViewById(R.id.med_girl);
        medgirl.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);*/
        mbutton1 = findViewById(R.id.button1);
        mbutton2 = findViewById(R.id.button2);
        mbutton3 = findViewById(R.id.button3);
        mbutton4 = findViewById(R.id.button4);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(meditation.this, medforstress.class));
            }
        });
    }
}