package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Gio_Hang extends AppCompatActivity {

    ListView lvgiohang;
    ImageView imgvhome1, imgvnguoi1, imgvbackgh, imgvchonptttgh;
    ArrayList<ClassGioHang> arrayGH;
    GioHangAdapter adapterGH;

    Button btndathanggh;
    TextView tvtongtiengh, tvsosanphamgh, txtconglsp, txttrulsp, txtsllsp, txtgialsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giohang);

        AnhXa();

        adapterGH = new GioHangAdapter(this, R.layout.dong_giohang, arrayGH);
        lvgiohang.setAdapter(adapterGH);



        //Tính tổng tiền, số sản phẩm
        double tongtien = 0;
        for(int i=0; i<adapterGH.getCount(); i++) {
            ClassGioHang gioHang = (ClassGioHang) adapterGH.getItem(i);
            tongtien = tongtien + gioHang.getGia() * gioHang.getSl();
        }
        tvtongtiengh.setText(tongtien + "đ");
        tvsosanphamgh.setText("Tổng " + adapterGH.getCount() + " sản phẩm");

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

        //trở lại trang thêm sản phầm
        imgvbackgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gio_Hang.this, Them_San_Pham.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang chọn phương thức thanh toán
//        imgvchonptttgh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Gio_Hang.this, Thanh_Toan.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        //đến trang tìm kiếm đúng
//        imgvhome1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Gio_Hang.this, TimKiemDung.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }

    private void AnhXa() {
        txtgialsp = (TextView) findViewById(R.id.tvgialsp);
        txtconglsp = (TextView) findViewById(R.id.tvconglsp);
        txtsllsp = (TextView) findViewById(R.id.tvsllsp);
        txttrulsp = (TextView) findViewById(R.id.tvtrulsp);
        tvsosanphamgh = (TextView) findViewById(R.id.tvsospgh);
        tvtongtiengh = (TextView) findViewById(R.id.tvtongtiengh);

        imgvbackgh = (ImageView) findViewById(R.id.imgvbackgh);
        imgvnguoi1 = (ImageView) findViewById(R.id.nguoi1);
        imgvhome1 = (ImageView) findViewById(R.id.home1);
        imgvchonptttgh = (ImageView) findViewById(R.id.imgvchonptttgh);

        btndathanggh = (Button) findViewById(R.id.btndathanggh);

        lvgiohang = (ListView) findViewById(R.id.lvgiohang);
        arrayGH = new ArrayList<>();

        arrayGH.add(new ClassGioHang("Hamburger bò với tương ớt vị caranbery", 59000, 2, R.drawable.hamburger));
        arrayGH.add(new ClassGioHang("Soda dâu tây", 39000, 1, R.drawable.sodachanh));
        arrayGH.add(new ClassGioHang("Salad trứng", 79000, 2, R.drawable.saladtrungmua));
    }
}