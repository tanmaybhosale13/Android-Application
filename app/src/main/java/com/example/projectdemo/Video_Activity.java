package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;



public class Video_Activity extends AppCompatActivity {

    Button playbtn;
     VideoView  videoView;
     TextView setinfo;
     Button button;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_);






        playbtn=findViewById(R.id.button9);
        videoView=findViewById(R.id.HealthCareVideo);
        setinfo=findViewById(R.id.textView_8);
        button=findViewById(R.id.button10);
          final MediaController  mediaController=new MediaController(this);

         playbtn.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("SetTextI18n")
             @Override

             public void onClick(View v) {
                 String path = "android.resource://" + getPackageName() + "/" + R.raw.healthcarevideo;
                 Uri uri=Uri.parse(path);
                 videoView.setVideoURI(uri);
                 videoView.setMediaController(mediaController);
                 mediaController.setAnchorView(videoView);
                 videoView.start();

                 setinfo.setText("This is a basic video of HealthCare application. because people are not aware about their own health and fitness.So hence Watched this Video till end!");



                 

             }
         });
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent obj=new Intent(Video_Activity.this,Pdf_Activity.class);
                 startActivity(obj);


             }
         });

    }
}
