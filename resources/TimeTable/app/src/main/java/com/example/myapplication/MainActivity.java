package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int options=0;
    int color=0;

    int lblue = Color.parseColor("#1E90FF");
    int dgrey = Color.parseColor("#282828");
    int lgrey = Color.parseColor("#505050");
    int green = Color.parseColor("#00a029");
    int black = Color.parseColor("#0A0A0A");

    int grey = Color.parseColor("#4F6F6F");
    int lred = Color.parseColor("#FFB6C1");
    int lgreen = Color.parseColor("#008000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        Button Options = findViewById(R.id.Options);
        Button button37 = findViewById(R.id.button37);
        Button Color = findViewById(R.id.Color);
        Button Reset = findViewById(R.id.Reset);

        LinearLayout Layout = findViewById(R.id.Layout);
        Button button3 = findViewById(R.id.button3);

        Button button13 = findViewById(R.id.button13);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button27 = findViewById(R.id.button27);
        Button button28 = findViewById(R.id.button28);
        Button button29 = findViewById(R.id.button29);
        Button button31 = findViewById(R.id.button31);
        Button button32 = findViewById(R.id.button32);
        Button button33 = findViewById(R.id.button33);
        Button button35 = findViewById(R.id.button35);
        Button button36 = findViewById(R.id.button36);

        Button button14 = findViewById(R.id.button14);
        Button button18 = findViewById(R.id.button18);
        Button button22 = findViewById(R.id.button22);
        Button button26 = findViewById(R.id.button26);
        Button button30 = findViewById(R.id.button30);
        Button button34 = findViewById(R.id.button34);

        View.OnClickListener Opcii = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (options==0){
                    Color.setVisibility(View.VISIBLE);
                    Reset.setVisibility(View.VISIBLE);
                    options=1;
                }else{
                    Color.setVisibility(View.INVISIBLE);
                    Reset.setVisibility(View.INVISIBLE);
                    options=0;
                }
            }
        };
        View.OnClickListener Cvet = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (color==0) {
                    button2.setBackgroundColor(grey);
                    Options.setBackgroundColor(grey);
                    button37.setBackgroundColor(grey);
                    Color.setBackgroundColor(grey);
                    Reset.setBackgroundColor(grey);

                    Layout.setBackgroundColor(lred);
                    button3.setBackgroundColor(lred);

                    button13.setBackgroundColor(lgreen);
                    button15.setBackgroundColor(lgreen);
                    button16.setBackgroundColor(lgreen);
                    button17.setBackgroundColor(lgreen);
                    button19.setBackgroundColor(lgreen);
                    button20.setBackgroundColor(lgreen);
                    button21.setBackgroundColor(lgreen);
                    button23.setBackgroundColor(lgreen);
                    button24.setBackgroundColor(lgreen);
                    button25.setBackgroundColor(lgreen);
                    button27.setBackgroundColor(lgreen);
                    button28.setBackgroundColor(lgreen);
                    button28.setBackgroundColor(lgreen);
                    button29.setBackgroundColor(lgreen);
                    button31.setBackgroundColor(lgreen);
                    button32.setBackgroundColor(lgreen);
                    button33.setBackgroundColor(lgreen);
                    button35.setBackgroundColor(lgreen);
                    button36.setBackgroundColor(lgreen);

                    button14.setBackgroundColor(black);
                    button18.setBackgroundColor(black);
                    button22.setBackgroundColor(black);
                    button26.setBackgroundColor(black);
                    button30.setBackgroundColor(black);
                    button34.setBackgroundColor(black);
                    button14.setTextColor(lblue);
                    button18.setTextColor(lblue);
                    button22.setTextColor(lblue);
                    button26.setTextColor(lblue);
                    button30.setTextColor(lblue);
                    button34.setTextColor(lblue);
                    color=1;
                }else{
                    button2.setBackgroundColor(lblue);
                    Options.setBackgroundColor(lblue);
                    button37.setBackgroundColor(lblue);
                    Color.setBackgroundColor(lblue);
                    Reset.setBackgroundColor(lblue);

                    Layout.setBackgroundColor(black);
                    button3.setBackgroundColor(black);

                    button13.setBackgroundColor(dgrey);
                    button15.setBackgroundColor(dgrey);
                    button16.setBackgroundColor(dgrey);
                    button17.setBackgroundColor(dgrey);
                    button19.setBackgroundColor(dgrey);
                    button20.setBackgroundColor(dgrey);
                    button21.setBackgroundColor(dgrey);
                    button23.setBackgroundColor(dgrey);
                    button24.setBackgroundColor(dgrey);
                    button25.setBackgroundColor(dgrey);
                    button27.setBackgroundColor(dgrey);
                    button28.setBackgroundColor(dgrey);
                    button28.setBackgroundColor(dgrey);
                    button29.setBackgroundColor(dgrey);
                    button31.setBackgroundColor(dgrey);
                    button32.setBackgroundColor(dgrey);
                    button33.setBackgroundColor(dgrey);
                    button35.setBackgroundColor(dgrey);
                    button36.setBackgroundColor(dgrey);

                    button14.setBackgroundColor(lgrey);
                    button18.setBackgroundColor(lgrey);
                    button22.setBackgroundColor(lgrey);
                    button26.setBackgroundColor(lgrey);
                    button30.setBackgroundColor(lgrey);
                    button34.setBackgroundColor(lgrey);
                    button14.setTextColor(green);
                    button18.setTextColor(green);
                    button22.setTextColor(green);
                    button26.setTextColor(green);
                    button30.setTextColor(green);
                    button34.setTextColor(green);
                    color=0;
                }
            }
        };
        Options.setOnClickListener(Opcii);
        Color.setOnClickListener(Cvet);
    }
}