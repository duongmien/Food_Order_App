package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Thiet_Lap_Mat_Khau extends AppCompatActivity {

    Button btnxacnhan;
    ImageView imgvbackmk, imgvnguoi2, imgvgio2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thietlapmatkhau);

        AnhXa();

        //quay lại trang hồ sơ
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thiet_Lap_Mat_Khau.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang hồ sơ
        imgvbackmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thiet_Lap_Mat_Khau.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang hồ sơ
        imgvnguoi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thiet_Lap_Mat_Khau.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang giỏ hàng
        imgvgio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thiet_Lap_Mat_Khau.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void AnhXa() {

        btnxacnhan = (Button) findViewById(R.id.btnxacnhanmk);
        imgvbackmk = (ImageView) findViewById(R.id.imgvbackmk);
        imgvnguoi2 = (ImageView) findViewById(R.id.nguoi2);
        imgvgio2 = (ImageView) findViewById(R.id.gio2);
    }
}