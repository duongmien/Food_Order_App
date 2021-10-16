package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HoSo extends AppCompatActivity {

    TextView txtdiachi, txtmatkhau, txtdangxuat;
    ImageView imgvchinhsua, imgvgio6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoso);

        AnhXa();

        //trang địa chỉ
        txtdiachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });

        //trang mật khẩu
        txtmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Thiet_Lap_Mat_Khau.class);
                startActivity(intent);
                finish();
            }
        });

        //trang chỉnh sửa thông tin cá nhân
        imgvchinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Chinh_Sua_Thong_Tin.class);
                startActivity(intent);
                finish();
            }
        });


        //đăng xuất, trở về trang đăng nhập
        txtdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang giỏ hàng
        imgvgio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void AnhXa() {

        txtdangxuat = (TextView) findViewById(R.id.tvhosodangxuat);
        txtdiachi = (TextView) findViewById(R.id.tvhosodiachi);
        txtmatkhau = (TextView) findViewById(R.id.tvhosomatkhau);
        imgvchinhsua = (ImageView) findViewById(R.id.imgvchinhsua);
        imgvgio6 = (ImageView) findViewById(R.id.gio1);

    }
}