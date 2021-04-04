package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class medforstress extends AppCompatActivity {
    private TextView countdownText;
    private Button countdownButton;
    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds=600000;
    private boolean timerRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medforstress);

        countdownText = findViewById(R.id.countdown_text);
        countdownButton = findViewById(R.id.countdown_button);

        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startstop();
            }
        });

        updateTimer();
    }
    public void startstop(){
        if (timerRunning){
            stoptimer();
        } else{
            starttimer();
        }

    }
    public void starttimer() {
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                 timeLeftInMilliseconds = l;
                 updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        countdownButton.setText("PAUSE");
        timerRunning=true;
    }
    public void stoptimer(){
       countDownTimer.cancel();
        countdownButton.setText("START");
       timerRunning=false;
    }

    public void updateTimer(){
        int minutes = (int) timeLeftInMilliseconds/600000;
        int seconds = (int) timeLeftInMilliseconds % 600000 / 1000;
        String timeLeftText;
        timeLeftText = "" + minutes;
        timeLeftText += ":";
        if(seconds<10) timeLeftText +="0";
        timeLeftText += seconds;
        countdownText.setText(timeLeftText);
    }
}