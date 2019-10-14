package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.rgSubject);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbAn){
                    Toast.makeText(Main2Activity.this, "Android", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.rbWeb){
                    Toast.makeText(Main2Activity.this, "Web API", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Main2Activity.this, "IOT", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
