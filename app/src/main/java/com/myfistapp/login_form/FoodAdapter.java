package com.myfistapp.login_form;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> foodList;

    public FoodAdapter(Context context, int layout, List<Food> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }


    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class   ViewHolder{
        ImageView image1, image2;
        TextView txtname1, txtname2;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(layout,null);

        //anh xa view
        TextView txtname1=(TextView) view.findViewById(R.id.thucuong);
        ImageView image1= (ImageView) view.findViewById(R.id.menu_item);
        TextView txtname2=(TextView) view.findViewById(R.id.garan);
        ImageView image2= (ImageView) view.findViewById(R.id.menu_item1);
        //gan gia tri
        Food food = foodList.get(i);
        txtname1.setText(food.getName1());
        image1.setImageResource(food.getImage1());
        txtname2.setText(food.getName2());
        image2.setImageResource(food.getImage2());



        return view;
    }
}

