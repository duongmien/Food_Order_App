package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Chinh_Sua_Thong_Tin extends AppCompatActivity {


    TextView txthuy;
    ImageView imgvbackcstt, imgvnguoi5, imgvgio5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinhsuathongtin);

        AnhXa();

        //đến trang giỏ hàng
        imgvgio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chinh_Sua_Thong_Tin.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });

        //quay lại trang hồ sơ
        txthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chinh_Sua_Thong_Tin.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang hồ sơ
        imgvbackcstt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chinh_Sua_Thong_Tin.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang hồ sơ
        imgvnguoi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chinh_Sua_Thong_Tin.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void AnhXa () {
        txthuy = (TextView) findViewById(R.id.editHUY);
        imgvbackcstt = (ImageView) findViewById(R.id.imgvbackcstt);
        imgvnguoi5 = (ImageView) findViewById(R.id.nguoi5);
        imgvgio5 = (ImageView) findViewById(R.id.gio5);
    }
}