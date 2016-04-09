package com.example.jera.videoviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath(
                "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");

        videoView.start();
    }
}
