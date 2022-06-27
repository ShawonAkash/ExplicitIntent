package com.example.akashahmed.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Akash Ahmed on 04-Feb-18.
 */

public class SecondActivity extends AppCompatActivity{
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=(TextView)findViewById(R.id.textView);
        Intent i=getIntent();
        String m = i.getDataString();
        text.setText(m);

    }
}
