package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText yourName;
    private TextView outputName;

    public void printHello(View v){
        Button helloButton = (Button) v;
        ((Button)v).setText("You clicked me");

        yourName = (EditText) findViewById(R.id.inputText);
        outputName = (TextView) findViewById(R.id.outputText);
        outputName.setText("Hello, " + yourName.getText());
        outputName.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}