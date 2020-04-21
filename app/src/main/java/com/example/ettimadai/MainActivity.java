package com.example.ettimadai;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reff= FirebaseDatabase.getInstance().getReference().child("Users");
        VideoView videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.one);
        videoview.setVideoURI(uri);
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
//        videoview.start();
        //1
        VideoView videoview1 = (VideoView) findViewById(R.id.videoView1);
        Uri uri1 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.two);
        videoview1.setVideoURI(uri1);
        MediaController mediaController1 = new
                MediaController(this);
        mediaController1.setAnchorView(videoview1);
        videoview1.setMediaController(mediaController1);
//        videoview1.start();
        //2
        VideoView videoview2 = (VideoView) findViewById(R.id.videoView2);
        Uri uri2 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.three);
        videoview2.setVideoURI(uri2);
        MediaController mediaController2 = new
                MediaController(this);
        mediaController2.setAnchorView(videoview2);
        videoview2.setMediaController(mediaController2);
        //3
        VideoView videoview3 = (VideoView) findViewById(R.id.videoView3);
        Uri uri3 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.four);
        videoview3.setVideoURI(uri3);
        MediaController mediaController3 = new
                MediaController(this);
        mediaController3.setAnchorView(videoview3);
        videoview3.setMediaController(mediaController3);
        //4
        VideoView videoview4 = (VideoView) findViewById(R.id.videoView4);
        Uri uri4 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.five);
        videoview4.setVideoURI(uri4);
        MediaController mediaController4 = new
                MediaController(this);
        mediaController4.setAnchorView(videoview4);
        videoview4.setMediaController(mediaController4);
    }
}
