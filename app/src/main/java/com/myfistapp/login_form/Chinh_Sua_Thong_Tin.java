package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Chinh_Sua_Thong_Tin extends AppCompatActivity {


    TextView txthuy;
    ImageView imgvbackcstt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinhsuathongtin);

        AnhXa();

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
    }

    private void AnhXa () {
        txthuy = (TextView) findViewById(R.id.editHUY);
        imgvbackcstt = (ImageView) findViewById(R.id.imgvbackcstt);
    }
}