package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dia_Chi extends AppCompatActivity {

    TextView txtthemdc, txtthemdc2;
    ImageView imgvbackdc, imgvnguoi4, imgvgio4;
    ListView lvdiachi;
    ArrayList<ClassDiaChi> arraydiachi;
    DiaChiAdapter adapterdiachi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diachi);

        AnhXa();

        adapterdiachi = new DiaChiAdapter(this, R.layout.dong_diachi, arraydiachi);
        lvdiachi.setAdapter(adapterdiachi);

        //sự kiện chọn item
        lvdiachi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(Dia_Chi.this, Sua_Dia_Chi.class);

                ClassDiaChi diaChi = arraydiachi.get(i);

                Bundle bundle = new Bundle();
                bundle.putString("hoten", diaChi.getHoten());
                bundle.putString("sdt", diaChi.getSdt());
                bundle.putString("sonha", diaChi.getSonha());
                bundle.putString("xa", diaChi.getXa());
                bundle.putString("huyen", diaChi.getHuyen());
                bundle.putString("thanhpho", diaChi.getThanhpho());

                intent.putExtra("diachi", bundle);

                startActivity(intent);
                finish();
            }
        });


        //quay lại trang hồ sơ cá nhân
        imgvbackdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dia_Chi.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });
        //quay lại trang hồ sơ cá nhân
        imgvnguoi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dia_Chi.this, HoSo.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang thêm địa chỉ mới
        txtthemdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dia_Chi.this, Them_Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });
        //đến trang thêm địa chỉ mới
        txtthemdc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dia_Chi.this, Them_Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang giỏ hàng
        imgvgio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dia_Chi.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void AnhXa () {
        imgvbackdc = (ImageView) findViewById(R.id.imgvbackdc);
        imgvnguoi4 = (ImageView) findViewById(R.id.nguoi4);
        imgvgio4 = (ImageView) findViewById(R.id.gio4);
        txtthemdc = (TextView) findViewById(R.id.tvthemdc);
        txtthemdc2 = (TextView) findViewById(R.id.tvthemdc2);

        lvdiachi = (ListView) findViewById(R.id.listdiachi);
        arraydiachi = new ArrayList<>();

        arraydiachi.add(new ClassDiaChi("Nguyễn Thị Khánh Hạ", "(+84) 123 456 789"
                , "Đà Nẵng", "Hải Châu", "Thanh Bình", "02 Thanh Sơn", "[Mặc định]"));
        arraydiachi.add(new ClassDiaChi("Nguyễn Thị Khánh Hạ", "(+84) 123 456 789"
                , "Quảng Nam", "Đại Lộc", "Đại Sơn", "Hội Khách Tây", ""));
    }
}