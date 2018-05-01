package com.example.andrej.ankylosingspondylitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrej.ankylosingspondylitis.anotheractivity.AboutTheDiseaseActivity;

public class MainActivity extends AppCompatActivity {

    private Button aboutTheDisease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutTheDisease = findViewById(R.id.aboutTheDiseaseButton);
    }

    public void goToTheDescriptionOfTheDisease (View view){
        Intent intent = new Intent(this, AboutTheDiseaseActivity.class);
        startActivity(intent);
    }
}
