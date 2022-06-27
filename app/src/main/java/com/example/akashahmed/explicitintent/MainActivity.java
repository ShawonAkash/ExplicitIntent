package com.example.akashahmed.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=(EditText) findViewById(R.id.editText);
        btn=(Button) findViewById(R.id.button);
    }
    public void sendButton(View v){
        String m =edit.getText().toString();
        Intent i= new Intent(this, SecondActivity.class);
        i.setData(Uri.parse(m));
        startActivity(i);
    }
}
