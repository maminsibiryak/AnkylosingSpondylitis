package com.example.andrej.ankylosingspondylitis.anotheractivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import com.example.andrej.ankylosingspondylitis.R;

public class AboutTheDiseaseActivity extends AppCompatActivity {

    private TextView aboutTheDiseaseLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_disease);

        aboutTheDiseaseLink = findViewById(R.id.about_the_desease_link);
        String htmlTaggedString  = "<u>Более подробная информация о Болезни Бехтерева</u>";
        Spanned textSpan  =  android.text.Html.fromHtml(htmlTaggedString);
        aboutTheDiseaseLink.setText(textSpan);
        aboutTheDiseaseLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ru.wikipedia.org/wiki/%D0%91%D0%BE%D0%BB%D0%B5%D0%B7%D0%BD%D1%8C_%D0%91%D0%B5%D1%85%D1%82%D0%B5%D1%80%D0%B5%D0%B2%D0%B0"));
                startActivity(intent);
            }
        });
    }
}
