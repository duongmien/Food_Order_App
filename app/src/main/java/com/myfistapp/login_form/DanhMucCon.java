package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhMucCon extends AppCompatActivity {
    ListView lvdanhmuc;
    ArrayList<contact> arrayDM;
    DanhSachAdapter adapterDM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmuccon);

        AnhXa();

        adapterDM = new DanhSachAdapter(this, R.layout.lv_danhsachmon, arrayDM);
        lvdanhmuc.setAdapter(adapterDM);
    }

        private void AnhXa() {

            lvdanhmuc = (ListView) findViewById(R.id.danhmuc);
            arrayDM = new ArrayList<>();

            arrayDM.add(new contact(R.drawable.sodachanh,"Soda chanh bạc hà",R.drawable.sinhtohoaqua,"Sinh tố hoa quả"));
            arrayDM.add(new contact(R.drawable.tradao,"Red Sea",R.drawable.capuchino,"Capuchino"));
            arrayDM.add(new contact(R.drawable.bacha,"Nước bạc hà",R.drawable.duahau,"Soda dưa hấu"));
    }
}