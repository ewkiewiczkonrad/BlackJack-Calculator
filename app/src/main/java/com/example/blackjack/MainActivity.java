package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
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

    Button buttonPlayer;
    Button buttonCurpiel;

   public TextView curpielPoints;
   public TextView playerPoints;

    public TextView what;

    int pointsPlayer= 0;
    int pointsCurpiel= 0;
    boolean isPlayer = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayer=(Button) findViewById(R.id.buttonPlayer);
        buttonCurpiel=(Button) findViewById(R.id.buttonCurpiel);

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

        buttonCurpiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPlayer=false;
            }
        });

        buttonPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPlayer=true;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 2;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=2;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 3;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=3;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 4;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=4;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 5;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=5;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 6;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=6;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 7;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=7;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 8;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=8;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 9;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=9;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 11;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                }
                else{
                    pointsCurpiel +=11;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                }
            }
        });
        Log.i("poitn",Integer.toString(pointsPlayer));
        if(pointsPlayer>21)
        {what.setText("Przegrałeś");}
        if(pointsCurpiel>21)
        {what.setText("Wygrałeś");}






    }




}
