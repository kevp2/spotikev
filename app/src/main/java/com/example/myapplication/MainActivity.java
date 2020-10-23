package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView button_play;
    Boolean is_paused = true;
    public MediaPlayer myMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_play = findViewById(R.id.button_play);

        myMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (is_paused) {
                    myMediaPlayer.start();
                    is_paused = false;
                } else {
                    myMediaPlayer.pause();
                    is_paused = true;
                }
            }
        });

    }
}