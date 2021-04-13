package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    TextView txt1,txt2,in,out;
    LottieAnimationView animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        new Handler().postDelayed(new Runnable (){
            @Override
            public void run(){
                Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(mainIntent);
                finish();
            }

        },SPLASH_TIME_OUT);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        in = findViewById(R.id.in);
        out = findViewById(R.id.out);
        animation = findViewById(R.id.animation);


        txt1.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);
        txt2.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);
        in.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);
        out.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);
        animation.animate().translationY(-3000).setDuration(3000).setStartDelay(4000);
    }
}




