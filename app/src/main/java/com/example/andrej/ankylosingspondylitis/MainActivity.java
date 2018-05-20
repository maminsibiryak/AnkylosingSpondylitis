package com.example.andrej.ankylosingspondylitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.andrej.ankylosingspondylitis.anotheractivity.AboutTheDiseaseActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.CausesActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.FirstSignsActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.PhysiotherapyActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.SymptomsActivity;
import com.example.andrej.ankylosingspondylitis.anotheractivity.TreatmentActivity;

public class MainActivity extends AppCompatActivity {

    private Button aboutTheDisease;
    private Button aboutSymptoms;
    private Button aboutTreatment;
    private Button aboutCauses;
    private Button aboutPhisiotherapy;

    private ImageButton aboutTheDiseaseImageButton;
    private ImageButton aboutSymptomsImageButton;
    private ImageButton aboutTreatmentImageButton;
    private ImageButton aboutCausesImageButton;
    private ImageButton aboutPhisiotherapyImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutTheDisease = findViewById(R.id.aboutTheDiseaseButton);
        aboutSymptoms = findViewById(R.id.symptomsButton);
        aboutTreatment = findViewById(R.id.treatmentButton);
        aboutCauses = findViewById(R.id.causesButton);
        aboutPhisiotherapy = findViewById(R.id.physiotherapyButton);

        aboutTheDiseaseImageButton = findViewById(R.id.imageButtonBB);
        aboutSymptomsImageButton = findViewById(R.id.imageButtonSymptoms);
        aboutTreatmentImageButton = findViewById(R.id.imageButtonTreatment);
        aboutCausesImageButton = findViewById(R.id.imageButtonCauses);
        aboutPhisiotherapyImageButton = findViewById(R.id.imageButtonPhysio);
    }

    public void goToTheDescriptionOfTheDisease (View view){
        Intent intent = new Intent(this, AboutTheDiseaseActivity.class);
        startActivity(intent);
    }

    public void goToTheSymptoms(View view){
        Intent intent = new Intent(this, SymptomsActivity.class);
        startActivity(intent);
    }

    public void goToTreatment(View view){
        Intent intent = new Intent(this, TreatmentActivity.class);
        startActivity(intent);
    }

    public void goToTheCauses(View view){
        Intent intent = new Intent(this, CausesActivity.class);
        startActivity(intent);
    }
    public void goToTheFirstSigns(View view){
        Intent intent = new Intent(this, FirstSignsActivity.class);
        startActivity(intent);
    }
    public void goToThePhisiotherapy(View view){
        Intent intent = new Intent(this, PhysiotherapyActivity.class);
        startActivity(intent);
    }
}
