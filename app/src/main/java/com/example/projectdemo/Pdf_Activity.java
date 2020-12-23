package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf_Activity extends AppCompatActivity {
   PDFView hospital_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_);
    hospital_details=findViewById(R.id.hospital_pdf);
    hospital_details.fromAsset("hospitals_in_india.pdf").load();

    }
}
