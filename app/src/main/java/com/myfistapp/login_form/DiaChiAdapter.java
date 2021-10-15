package com.myfistapp.login_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DiaChiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ClassDiaChi> classDiaChiList;

    public DiaChiAdapter(Context context, int layout, List<ClassDiaChi> classDiaChiList) {
        this.context = context;
        this.layout = layout;
        this.classDiaChiList = classDiaChiList;
    }

    @Override
    public int getCount() {
        return classDiaChiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        //ánh xạ view
        TextView txthoten = (TextView) view.findViewById(R.id.tvtennguoidung);
        TextView txtsdt = (TextView) view.findViewById(R.id.tvsdtdiachi);
        TextView txtfull = (TextView) view.findViewById(R.id.tvquanhuyen);
        TextView txtsonha = (TextView) view.findViewById(R.id.tvtenduong);
        TextView txtmacdinh = (TextView) view.findViewById(R.id.tvmacdinh);

        //gán gía trị
        ClassDiaChi diaChi = classDiaChiList.get(i);
        txthoten.setText(diaChi.getHoten());
        txtmacdinh.setText(diaChi.getMacdinh());
        txtsdt.setText(diaChi.getSdt());
        txtsonha.setText(diaChi.getSonha());
        txtfull.setText(diaChi.getHuyen()+", "+diaChi.getXa()+", "+diaChi.getThanhpho());

        return view;
    }
}
