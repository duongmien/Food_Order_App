package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Them_Dia_Chi extends AppCompatActivity {

    ImageView imgvbacktdc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themdiachi);

        AnhXa();

        //quay lại trang địa chỉ
        imgvbacktdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Them_Dia_Chi.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void AnhXa() {
        imgvbacktdc = (ImageView) findViewById(R.id.imgvbacksdc);
    }
}