package com.example.andrej.ankylosingspondylitis.anotheractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.andrej.ankylosingspondylitis.R;

public class TreatmentActivity extends AppCompatActivity {

    private TextView treatmentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        treatmentTextView = findViewById(R.id.treatmentTextView);
        treatmentTextView.setMovementMethod(new ScrollingMovementMethod());
        treatmentTextView.setText(Html.fromHtml(getString(R.string.treatment)));
    }
}
