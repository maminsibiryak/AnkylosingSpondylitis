package com.example.andrej.ankylosingspondylitis.anotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.andrej.ankylosingspondylitis.R;
import com.example.andrej.ankylosingspondylitis.anotheractivity.physiotherapy.BukletPDFActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.physiotherapy.PhotoPhysiotherapyActivity;

public class PhysiotherapyActivity extends AppCompatActivity {

    private Button photoButton;
    private TextView author;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiotherapy);
        photoButton = findViewById(R.id.photoButton);
        author = findViewById(R.id.textView25);



    }
    public void goToThePhotoPhisiotherapy(View view){
        Intent intent = new Intent(this, PhotoPhysiotherapyActivity.class);
        startActivity(intent);
    }
    public void goToThePDFPhisiotherapy(View view){
        Intent intent = new Intent(this, BukletPDFActivity.class);
        startActivity(intent);
    }
}
