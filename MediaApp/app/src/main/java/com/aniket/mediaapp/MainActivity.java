package com.aniket.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button playButton;
    private Button pauseButton;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mediaPlayer = MediaPlayer.create(this, R.raw.samplemusic);
        mediaPlayer = new MediaPlayer();
        playButton = findViewById(R.id.playButton);
        pauseButton = findViewById(R.id.pauseButton);

        seekBar = findViewById(R.id.seekBar);

        try {
            mediaPlayer.setDataSource("https://themamaship.com/music/Catalog/Akon%20ft.%20Gwen%20stephanie%20-%20The%20Sweet%20Escape.mp3");
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error downloading file", Toast.LENGTH_SHORT).show();;
        }

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Ready to Play", Toast.LENGTH_SHORT).show();
                mp.start();
                System.out.println(mediaPlayer.getDuration());
                seekBar.setMax(mediaPlayer.getDuration());

                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser){
                            mediaPlayer.seekTo(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
            }
        });

        mediaPlayer.prepareAsync();
//        mediaPlayer.start();
//        mediaPlayer.pause();
//



        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}