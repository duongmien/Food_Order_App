package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dat_Hang_Thanh_Cong extends AppCompatActivity {

    ImageView imgvbackdhtc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dathangthanhcong);

        AnhXa();

        //quay lại giỏ hàng
        imgvbackdhtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dat_Hang_Thanh_Cong.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void AnhXa() {
        imgvbackdhtc = (ImageView) findViewById(R.id.imgvbackdhtc);
    }
}