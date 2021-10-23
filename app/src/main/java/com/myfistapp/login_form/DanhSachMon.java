package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhSachMon extends AppCompatActivity {
    ListView lvdanhsach;
    ArrayList<contact> arrayDS;
    DanhSachAdapter adapterDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachmon);

        AnhXa();

        adapterDS = new DanhSachAdapter(this, R.layout.lv_danhsachmon, arrayDS);
        lvdanhsach.setAdapter(adapterDS);
    }
    private void AnhXa() {

        lvdanhsach = (ListView) findViewById(R.id.dsmonan);
        arrayDS = new ArrayList<>();

        arrayDS.add(new contact(R.drawable.swvietquat,"Sandwish Việt quất",R.drawable.pizzahaisan,"Pizza Hải sản"));
        arrayDS.add(new contact(R.drawable.redsea,"Red Sea",R.drawable.banhdau,"Bánh dâu"));
        arrayDS.add(new contact(R.drawable.anttin,"Anttin Mexico",R.drawable.cahoi,"Cá hồi áp chảo"));
    }
}