package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Them_Dia_Chi extends AppCompatActivity {

    ImageView imgvbacktdc, imgvnguoi3, imgvgio3;
    Button btnthemdc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themdiachi);

        AnhXa();


        //quay lại trang hồ sơ cá nhân
        imgvnguoi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Them_Dia_Chi.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });

        //quay lại trang địa chỉ
        imgvbacktdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Them_Dia_Chi.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang địa chỉ
        btnthemdc .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Them_Dia_Chi.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang giỏ hàng
        imgvgio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Them_Dia_Chi.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void AnhXa() {
        imgvnguoi3 = (ImageView) findViewById(R.id.nguoi3);
        imgvgio3 = (ImageView) findViewById(R.id.gio3);
        imgvbacktdc = (ImageView) findViewById(R.id.imgvbacksdc);
        btnthemdc = (Button) findViewById(R.id.btntdc);
    }
}