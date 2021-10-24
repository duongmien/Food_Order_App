package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TimKiemDung extends AppCompatActivity {

    ListView lvtimkiem;
    ArrayList<classtimkiemdung> arrayTK;
    TimKiemDungAdapter adapterTK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiemdung);


        anhxa();
        adapterTK = new TimKiemDungAdapter(this,R.layout.lv_timkiemdung,arrayTK);
        lvtimkiem.setAdapter(adapterTK);
    }

    private void anhxa(){
        lvtimkiem = (ListView)findViewById(R.id.dstimkiem);
        arrayTK =new ArrayList<>();

        arrayTK.add(new classtimkiemdung(R.drawable.hbgbo,"Hamburger bò với tương ớt vị Carabenry", R.drawable.star, "-", "1", "+", "Ship miễn phí", "Giảm 3%", "59.000 đ"));
        arrayTK.add(new classtimkiemdung(R.drawable.hbgcahoi,"Hamburger cá hồi nướng bóng đêm", R.drawable.star, "-", "1", "+", "Ship miễn phí", "Giảm 3%", "69.000 đ"));
        arrayTK.add(new classtimkiemdung(R.drawable.hbgga,"Hamburger gà với nước sốt đặc biệt", R.drawable.star, "-", "1", "+", "Ship miễn phí", "Giảm 5%", "49.000 đ"));
        arrayTK.add(new classtimkiemdung(R.drawable.hbgg,"Hamburger thịt heo với hương vị đặc biệt", R.drawable.star, "-", "1", "+", "Ship miễn phí", "Giảm 0%", "49.000 đ"));
    }
}