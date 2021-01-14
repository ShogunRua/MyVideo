package com.example.myvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    private static final String videoUrl = "https://firebasestorage.googleapis.com/v0/b/vplayer-6a124.appspot.com/o/NO%20EXCUSES%20-%20Best%20Motivational%20Video.mp4?alt=media&token=0bc975d4-be5a-40c5-80e9-618585b7030a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.video);
        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(videoUrl);
                playVideo(uri);

            }
        });

    }
    private void playVideo(Uri uri){
        MediaController mediaController = new MediaController(MainActivity.this);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}