package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Thanh_Toan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        Button button = findViewById(R.id.bt_dongy);
        RadioButton radio_a= findViewById(R.id.radio_a);
        RadioButton radio_b= findViewById(R.id.radio_b);
        RadioButton radio_c= findViewById(R.id.radio_c);
        RadioButton radio_d= findViewById(R.id.radio_d);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        radio_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_a.setChecked(true);
                radio_b.setChecked(false);
                radio_c.setChecked(false);
                radio_d.setChecked(false);


            }
        });
        radio_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_a.setChecked(false);
                radio_b.setChecked(true);
                radio_c.setChecked(false);
                radio_d.setChecked(false);


            }
        });

        radio_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_a.setChecked(false);
                radio_b.setChecked(false);
                radio_c.setChecked(true);
                radio_d.setChecked(false);


            }
        });

        radio_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_a.setChecked(false);
                radio_b.setChecked(false);
                radio_c.setChecked(false);
                radio_d.setChecked(true);


            }
        });


    }
}
