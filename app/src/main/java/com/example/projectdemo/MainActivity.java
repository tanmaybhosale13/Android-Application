package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;



import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button b1;
    Button dialogBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button0);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(obj);


            }
        });
        dialogBox = findViewById(R.id.aboutButton);
        dialogBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


    }

    public void openDialog() {

        DialogBox dialog = new DialogBox();

        dialog.show(getSupportFragmentManager(), "DialogDemo");


    }

    @Override
    public void onBackPressed() {
        ActivityCompat.finishAffinity(this);
    }
}

