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
    Button playAgainButton;

   public TextView curpielPoints;
   public TextView playerPoints;

    public TextView what;

    int pointsPlayer= 0;
    int pointsCurpiel= 0;
    boolean isPlayer = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayer=(Button) findViewById(R.id.buttonPlayer);
        buttonCurpiel=(Button) findViewById(R.id.buttonCurpiel);
        playAgainButton=findViewById(R.id.playAgainButton);

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

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Od nowa",Integer.toString(pointsCurpiel));
                playGame();
            }
        });

        playGame();



    }

    public void playGame(){
        pointsPlayer=0;
        pointsCurpiel=0;
        what.setText("Dodaj karte Kurpiera");
        curpielPoints.setText("0");
        playerPoints.setText("0");

        ace.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        ten.setEnabled(true);
        jack.setEnabled(true);
        queen.setEnabled(true);
        king.setEnabled(true);
        buttonCurpiel.setEnabled(true);
        isPlayer=false;

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
                    check();
                }
                else{
                    pointsCurpiel +=2;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 3;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=3;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 4;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=4;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 5;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=5;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 6;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=6;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 7;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=7;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 8;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=8;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 9;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=9;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 10;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=10;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });
        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlayer==true) {
                    pointsPlayer += 11;
                    playerPoints.setText(Integer.toString(pointsPlayer));
                    check();
                }
                else{
                    pointsCurpiel +=11;
                    curpielPoints.setText(Integer.toString(pointsCurpiel));
                    check();
                }
            }
        });




    }

    public void check(){
        if(pointsCurpiel!=0){
            buttonCurpiel.setEnabled(false);
            isPlayer=true;
        }

        switch (pointsCurpiel) {
            case 2:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 3:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 12)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11) || (pointsPlayer == 9)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 4:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11) || (pointsPlayer == 9)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 5:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11) || (pointsPlayer == 9)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 6:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11) || (pointsPlayer == 9)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 7:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)
                        || (pointsPlayer == 13) || (pointsPlayer == 14)
                        || (pointsPlayer == 15) || (pointsPlayer == 16)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 8:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)
                        || (pointsPlayer == 13) || (pointsPlayer == 14)
                        || (pointsPlayer == 15) || (pointsPlayer == 16)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 9:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)
                        || (pointsPlayer == 13) || (pointsPlayer == 14)
                        || (pointsPlayer == 15) || (pointsPlayer == 16)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 10) || (pointsPlayer == 11)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 10:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)
                        || (pointsPlayer == 13) || (pointsPlayer == 14)
                        || (pointsPlayer == 15) || (pointsPlayer == 16)
                        || (pointsPlayer == 10)) {
                    what.setText("Dobierz karte");
                } else if ((pointsPlayer == 11)) {
                    what.setText("Podwój stawkę");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            case 11:
                if ((pointsPlayer == 0) || (pointsPlayer == 4) || (pointsPlayer == 5) || (pointsPlayer == 6)
                        || (pointsPlayer == 7) || (pointsPlayer == 8)
                        || (pointsPlayer == 9) || (pointsPlayer == 12)
                        || (pointsPlayer == 13) || (pointsPlayer == 14)
                        || (pointsPlayer == 15) || (pointsPlayer == 16)
                        || (pointsPlayer == 10) || (pointsPlayer == 11)) {
                    what.setText("Dobierz karte");
                } else {
                    what.setText("Nie dobieraj karty");
                }
                break;
            default:
                what.setText("Dobierz karte");
                break;
        }

                    Log.i("poitn",Integer.toString(pointsPlayer));
                    if(pointsPlayer>21){

                        ace.setEnabled(false);
                        two.setEnabled(false);
                        three.setEnabled(false);
                        four.setEnabled(false);
                        five.setEnabled(false);
                        six.setEnabled(false);
                        seven.setEnabled(false);
                        eight.setEnabled(false);
                        nine.setEnabled(false);
                        ten.setEnabled(false);
                        jack.setEnabled(false);
                        queen.setEnabled(false);
                        king.setEnabled(false);
                        what.setText("Przegrałeś");
                    }

        }
    }





