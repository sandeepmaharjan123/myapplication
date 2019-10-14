package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity implements View.OnClickListener {

    Button button_1,button_2, button_3 ,button_4,
            button_5, button_6, button_7,button_8, button_9,
            button_0, button_add, button_div, button_multi,
            button_sub, button_equ, button_clear;
    TextView text;
    String displayNum = "";
    int num1,num2;
    int res;
    String op;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        button_0 = findViewById(R.id.num_0);
        button_1 = findViewById(R.id.num_1);
        button_2 = findViewById(R.id.num_2);
        button_3 = findViewById(R.id.num_3);
        button_4 = findViewById(R.id.num_4);
        button_5 = findViewById(R.id.num_5);
        button_6 = findViewById(R.id.num_6);
        button_7 = findViewById(R.id.num_7);
        button_8 = findViewById(R.id.num_8);
        button_9 = findViewById(R.id.num_9);
        button_add = findViewById(R.id.num_add);
        button_sub = findViewById(R.id.num_sub);
        button_multi = findViewById(R.id.num_multi);
        button_div = findViewById(R.id.num_div);
        button_clear = findViewById(R.id.num_clear);
        button_equ = findViewById(R.id.num_equal);
        text = findViewById(R.id.text);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.num_0:
                displayNum += 0;
                text.setText(displayNum);
                break;

            case R.id.num_1:
                displayNum += 1;
                text.setText(displayNum);
                break;

            case R.id.num_2:
                displayNum += 2;
                text.setText(displayNum);
                break;

            case R.id.num_3:
                displayNum += 3;
                text.setText(displayNum);
                break;

            case R.id.num_4:
                displayNum += 4;
                text.setText(displayNum);
                break;

            case R.id.num_5:
                displayNum += 5;
                text.setText(displayNum);
                break;

            case R.id.num_6:
                displayNum += 6;
                text.setText(displayNum);
                break;

            case R.id.num_7:
                displayNum += 7;
                text.setText(displayNum);
                break;

            case R.id.num_8:
                displayNum += 8;
                text.setText(displayNum);
                break;

            case R.id.num_9:
                displayNum += 9;
                text.setText(displayNum);
                break;

        }
    }
}
