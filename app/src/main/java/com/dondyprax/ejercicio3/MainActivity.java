package com.dondyprax.ejercicio3;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView redPanel = findViewById(R.id.red_panel);
        TextView greenPanel = findViewById(R.id.green_panel);
        TextView bluePanel = findViewById(R.id.blue_panel);

        final String[] redArray = {getString(R.string.red1), getString(R.string.red2), getString(R.string.red3), getString(R.string.red4), getString(R.string.red5), getString(R.string.red6)};
        final String[] greenArray = {getString(R.string.green1), getString(R.string.green2), getString(R.string.green3), getString(R.string.green4), getString(R.string.green5), getString(R.string.green6)};
        final String[] blueArray = {getString(R.string.blue1), getString(R.string.blue2), getString(R.string.blue3), getString(R.string.blue4), getString(R.string.blue5), getString(R.string.blue6)};

        redPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String randomColor = redArray[new Random().nextInt(redArray.length)];
                v.setBackgroundColor(Color.parseColor(randomColor));
            }
        });

        greenPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String randomColor = greenArray[new Random().nextInt(greenArray.length)];
                v.setBackgroundColor(Color.parseColor(randomColor));
            }
        });

        bluePanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String randomColor = blueArray[new Random().nextInt(blueArray.length)];
                v.setBackgroundColor(Color.parseColor(randomColor));
            }
        });
    }

}
