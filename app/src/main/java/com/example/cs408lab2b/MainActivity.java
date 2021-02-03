package com.example.cs408lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] helpArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helpArray = getResources().getStringArray(R.array.help);;
    }
    public void onClickHelpButton(View v) {
        Random rand = new Random();
        int bound= 18;
        int randomHelp= rand.nextInt(bound);
        TextView a = (TextView) findViewById(R.id.outputText);
        a.setText(helpArray[randomHelp]);

    }
}