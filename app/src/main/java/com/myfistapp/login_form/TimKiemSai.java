package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TimKiemSai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiemsai);

        //Hạ test
//        ImageView giohang = (ImageView) findViewById(R.id.giohang);
//        giohang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TimKiemSai.this, Gio_Hang.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }
}