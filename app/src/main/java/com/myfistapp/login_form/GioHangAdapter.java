package com.myfistapp.login_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GioHangAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ClassGioHang> gioHangList;

    public GioHangAdapter(Context context, int layout, List<ClassGioHang> gioHangList) {
        this.context = context;
        this.layout = layout;
        this.gioHangList = gioHangList;
    }

    @Override
    public int getCount() {
        return gioHangList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imghinh;
        TextView txtten, txtgia, txtsl;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            //ánh xạ view
            holder.imghinh = (ImageView) view.findViewById(R.id.imgvhinhgh);
            holder.txtgia = (TextView) view.findViewById(R.id.tvgiagh);
            holder.txtsl = (TextView) view.findViewById(R.id.tvslgh);
            holder.txtten = (TextView) view.findViewById(R.id.tvtenmongh);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        //gán giá trị
        ClassGioHang gioHang = gioHangList.get(i);

        holder.txtten.setText(gioHang.getTen());
        holder.txtsl.setText(gioHang.getSl() + "");
        holder.txtgia.setText(gioHang.getGia() + "đ");
        holder.imghinh.setImageResource(gioHang.getHinh());

        return view;
    }
}
