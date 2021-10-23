package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Category extends AppCompatActivity {
    ListView lvFood;
    ArrayList<Food> arrayFood;
    FoodAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Anhxa();
        adapter= new FoodAdapter(this,R.layout.item_food, arrayFood);
        lvFood.setAdapter(adapter);

    }

    private void Anhxa() {
        lvFood =(ListView) findViewById(R.id.lvFood);
        arrayFood= new ArrayList<>();

        arrayFood.add(new Food("Thức uống","Gà rán",R.drawable.menu_item,R.drawable.menu_item1));
        arrayFood.add(new Food("Mỳ ý","Tráng miệng",R.drawable.menu_item2,R.drawable.menu_item3));
        arrayFood.add(new Food("Salad","Hambuger",R.drawable.menu_item4,R.drawable.menu_item5));








    }
}