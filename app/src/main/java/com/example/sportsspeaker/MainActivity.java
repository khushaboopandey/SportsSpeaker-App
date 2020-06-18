package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgBoxing, imgKickboxing,
            imgJudo, imgKarate, imgAkido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.boxing);
        imgKickboxing = findViewById(R.id.imgKickboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAkido = findViewById(R.id.imgaikido);
        imgTaekwondo = findViewById(R.id.imgtaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickboxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgAkido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButtonView) {

        switch (imageButtonView.getId()) {

            case R.id.boxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickboxing:
                playSportName(imgKickboxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());

                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());

                break;
            case R.id.imgaikido:
                playSportName(imgAkido.getTag().toString());

                break;
            case R.id.imgtaekwondo:
                playSportName(imgTaekwondo.getTag().toString());

                break;

        }


    }

    private void playSportName(String sportname) {
        MediaPlayer sportPlayer = MediaPlayer.create(this, getResources().getIdentifier(sportname, "raw", getPackageName()));
        sportPlayer.start();
    }
}