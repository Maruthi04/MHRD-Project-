package com.example.ettimadai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
    }
    public void videos(View v){
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
    public void quiz(View v){
        Intent in=new Intent(this,quizes.class);
        startActivity(in);
    }

}
