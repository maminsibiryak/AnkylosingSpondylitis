package com.example.andrej.ankylosingspondylitis.anotheractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.andrej.ankylosingspondylitis.R;

public class FirstSignsActivity extends AppCompatActivity {
    private Spinner firstSignsSpinner;
    private TextView someSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_signs);

        String[] signs = {
                "Скованность и боль в пояснице и в области крестца. Возможна иррадиация болезненных ощущений в нижние конечности, в ягодицы. Боли имеют тенденцию усиливаться в утренние часы.",
                "В молодом возрасте болезненные ощущения возникают в зоне пяток.",
                "Скованность распространяется на грудной отдел позвоночника.",
                "Если выполнить пациенту клинический анализ крови, то СОЭ будет увеличено в пределах от 30 до 60 мм/час."};
        someSign = findViewById(R.id.signsTextView2);
        someSign.setText("-Скованность и боль в пояснице и в области крестца. Возможна иррадиация болезненных ощущений в нижние конечности, в ягодицы. Боли имеют тенденцию усиливаться в утренние часы."+"\n"+
                "-В молодом возрасте болезненные ощущения возникают в зоне пяток."+"\n"+
                "-Скованность распространяется на грудной отдел позвоночника."+"\n"+
                "-Если выполнить пациенту клинический анализ крови, то СОЭ будет увеличено в пределах от 30 до 60 мм/час.");

        /*ArrayAdapter<String> signsArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, signs);
        signsArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        firstSignsSpinner = findViewById(R.id.signs);
        firstSignsSpinner.setAdapter(signsArrayAdapter);

        someSign = findViewById(R.id.signsTextView2);
        firstSignsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                someSign.setText();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/


    }
}
