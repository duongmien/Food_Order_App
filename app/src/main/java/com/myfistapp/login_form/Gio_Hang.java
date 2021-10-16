package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Gio_Hang extends AppCompatActivity {

    ListView lvgiohang;
    ImageView imgvnguoi1;
    ArrayList<ClassGioHang> arrayGH;
    GioHangAdapter adapterGH;

    ImageView imgvbackgh;
    Button btndathanggh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giohang);

        AnhXa();

        adapterGH = new GioHangAdapter(this, R.layout.dong_giohang, arrayGH);
        lvgiohang.setAdapter(adapterGH);


        //chuyển đến trang đặt hàng thành công
        btndathanggh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gio_Hang.this, Dat_Hang_Thanh_Cong.class);
                startActivity(intent);
                finish();
            }
        });

        //chuyển đến trang hồ sơ cá nhân
        imgvnguoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gio_Hang.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void AnhXa() {
        imgvbackgh = (ImageView) findViewById(R.id.imgvbackgh);
        imgvnguoi1 = (ImageView) findViewById(R.id.nguoi1);
        btndathanggh = (Button) findViewById(R.id.btndathanggh);

        lvgiohang = (ListView) findViewById(R.id.lvgiohang);
        arrayGH = new ArrayList<>();

        arrayGH.add(new ClassGioHang("Hamburger bò với tương ớt vị caranbery", 59000, 2, R.drawable.hamburger));
        arrayGH.add(new ClassGioHang("Soda dâu tây", 39000, 1, R.drawable.sodachanh));
        arrayGH.add(new ClassGioHang("Salad trứng", 79000, 2, R.drawable.saladtrungmua));
    }
}