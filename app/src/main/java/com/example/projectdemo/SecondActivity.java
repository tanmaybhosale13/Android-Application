package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button cancerInfo;
    Button diagbetesInfo;
    Button bloodPressureInfo;
    Button typhoidInfo;
    Button brainTumourInfo;
    Button malariaInfo;
    Button lastPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        cancerInfo=findViewById(R.id.button1);
        diagbetesInfo=findViewById(R.id.button_2);
        bloodPressureInfo=findViewById(R.id.button3);
        typhoidInfo=findViewById(R.id.button4);
        malariaInfo=findViewById(R.id.button5);
        brainTumourInfo=findViewById(R.id.button6);
        lastPage=findViewById(R.id.button7);

        cancerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancer=new Intent(SecondActivity.this,Cancer.class);
                startActivity(cancer);
            }
        });
        diagbetesInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diabetes=new Intent(SecondActivity.this,Diabetes.class);
                startActivity(diabetes);
            }
        });
       bloodPressureInfo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bloodPressure=new Intent(SecondActivity.this,Bloodpressure.class);
               startActivity(bloodPressure);
           }
       });
        typhoidInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent typhoid=new Intent(SecondActivity.this,Typhoid.class);
                startActivity(typhoid);
            }
        });
        malariaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent malaria=new Intent(SecondActivity.this,Malaria.class);
                startActivity(malaria);
            }
        });

        brainTumourInfo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent tumour=new Intent(SecondActivity.this,BrainTumour.class);
               startActivity(tumour);
           }
       });
       lastPage.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent lastPage=new Intent(SecondActivity.this,LastPage.class);
              startActivity(lastPage);
          }
      });




    }
}
