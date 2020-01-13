package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton ace;
    ImageButton two;
    ImageButton three;
    ImageButton four;
    ImageButton five;
    ImageButton six;
    ImageButton seven;
    ImageButton eight;
    ImageButton nine;
    ImageButton ten;
    ImageButton jack;
    ImageButton queen;
    ImageButton king;

    TextView curpielPoints;
   public TextView playerPoints;

    TextView what;

    int pointsPlayer= 10;
    int pointsCurpiel= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ace=(ImageButton) findViewById(R.id.ace);
        two=(ImageButton) findViewById(R.id.two);
        three=(ImageButton)findViewById(R.id.three);
        four=(ImageButton) findViewById(R.id.four);
        five=(ImageButton)findViewById(R.id.five);
        six=(ImageButton)findViewById(R.id.six);
        seven=(ImageButton)findViewById(R.id.seven);
        eight=(ImageButton)findViewById(R.id.eight);
        nine=(ImageButton)findViewById(R.id.nine);
        ten=(ImageButton)findViewById(R.id.ten);
        jack=(ImageButton)findViewById(R.id.jack);
        queen=(ImageButton)findViewById(R.id.queen);
        king=(ImageButton)findViewById(R.id.king);

        curpielPoints=(TextView)findViewById(R.id.curpielPoints);
        playerPoints=(TextView)findViewById(R.id.playerPoints);
        what=(TextView) findViewById(R.id.what);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });
        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsPlayer=+2;
                playerPoints.setText(pointsPlayer);
            }
        });






    }




}
