package com.example.ettimadai;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("video");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("video");
        }
        if(newString.equals("1")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.one);
        videoview.setVideoURI(uri);
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
     videoview.start();
        }
        else if(newString.equals("2")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.two);
            videoview.setVideoURI(uri);
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoview);
            videoview.setMediaController(mediaController);
        videoview.start();
        }
        else if(newString.equals("3")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.three);
            videoview.setVideoURI(uri);
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoview);
            videoview.setMediaController(mediaController);
        videoview.start();
        }
        else if(newString.equals("4")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.four);
            videoview.setVideoURI(uri);
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoview);
            videoview.setMediaController(mediaController);
        videoview.start();
        }
        else if(newString.equals("5")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.five);
            videoview.setVideoURI(uri);
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoview);
            videoview.setMediaController(mediaController);
        videoview.start();
        }
        else if(newString.equals("6")){
            VideoView videoview = (VideoView) findViewById(R.id.videoView);
            View view = findViewById(R.id.videoView);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width =600;
            view.setLayoutParams(layoutParams);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.six);
            videoview.setVideoURI(uri);
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoview);
            videoview.setMediaController(mediaController);
        videoview.start();
        }
        else{
            Toast.makeText(this,"There is no Such video",Toast.LENGTH_LONG).show();
        }
    }
}
