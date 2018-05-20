package com.example.andrej.ankylosingspondylitis.anotheractivity.physiotherapy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.andrej.ankylosingspondylitis.R;
import com.github.barteksc.pdfviewer.PDFView;

public class BukletPDFActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buklet_pdf);
        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("lfk_a6.pdf").load();
    }
}
