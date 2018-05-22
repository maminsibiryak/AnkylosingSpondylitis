package com.example.andrej.ankylosingspondylitis.anotheractivity.physiotherapy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.andrej.ankylosingspondylitis.R;

public class PhotoPhysiotherapyActivity extends AppCompatActivity {
    private TextView aboutAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_physiotherapy);
        /*aboutAuthor = findViewById(R.id.textView25);
        aboutAuthor.setText(Html.fromHtml(getString(R.string.author)));
        aboutAuthor.setMovementMethod(LinkMovementMethod.getInstance());*/

    }
}
