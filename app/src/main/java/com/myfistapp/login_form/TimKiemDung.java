package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TimKiemDung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiemdung);


        //Hạ test
//        TextView noidungtimkiem = (TextView) findViewById(R.id.noidungtimkiem);
//        noidungtimkiem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TimKiemDung.this, TimKiemSai.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }
}