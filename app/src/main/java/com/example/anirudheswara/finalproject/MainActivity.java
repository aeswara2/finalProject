package com.example.anirudheswara.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView displayFace;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer rollDiceSound = MediaPlayer.create(this, R.raw.sounddice);

        displayFace = findViewById(R.id.dice);
        displayFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDiceSound.start();
                roll();
            }
        });
    }
    private void roll(){
        int randomNumber = random.nextInt(21) + 1;
        switch (randomNumber) {
            case 1:
                displayFace.setImageResource(R.drawable.domino11);
                break;
            case 2:
                displayFace.setImageResource(R.drawable.domino12);
                break;
            case 3:
                displayFace.setImageResource(R.drawable.domino13);
                break;
            case 4:
                displayFace.setImageResource(R.drawable.domino14);
                break;
            case 5:
                displayFace.setImageResource(R.drawable.domino15);
                break;
            case 6:
                displayFace.setImageResource(R.drawable.domino16);
                break;
            case 7:
                displayFace.setImageResource(R.drawable.domino22);
                break;
            case 8:
                displayFace.setImageResource(R.drawable.domino23);
                break;
            case 9:
                displayFace.setImageResource(R.drawable.domino24);
                break;
            case 10:
                displayFace.setImageResource(R.drawable.domino25);
                break;
            case 11:
                displayFace.setImageResource(R.drawable.domino26);
                break;
            case 12:
                displayFace.setImageResource(R.drawable.domino33);
                break;
            case 13:
                displayFace.setImageResource(R.drawable.domino34);
                break;
            case 14:
                displayFace.setImageResource(R.drawable.domino35);
                break;
            case 15:
                displayFace.setImageResource(R.drawable.domino36);
                break;
            case 16:
                displayFace.setImageResource(R.drawable.domino44);
                break;
            case 17:
                displayFace.setImageResource(R.drawable.domino45);
                break;
            case 18:
                displayFace.setImageResource(R.drawable.domino46);
                break;
            case 19:
                displayFace.setImageResource(R.drawable.domino55);
                break;
            case 20:
                displayFace.setImageResource(R.drawable.domino56);
                break;
            case 21:
                displayFace.setImageResource(R.drawable.domino66);
                break;

        }
    }
}
