package com.myfistapp.login_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DanhSachAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<contact> danhSachList;

    public DanhSachAdapter(Context context, int layout,List<contact> danhSachList ){
        this.context = context;
        this.layout= layout;
        this.danhSachList = danhSachList;
    }

    @Override
    public int getCount() {
        return danhSachList.size();
    }

    @Override
    public Object getItem(int i) {
        return danhSachList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class   ViewHolder{
        ImageView imghinh;
        TextView txtten;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();

            //ánh xạ view
            holder.imghinh = (ImageView) view.findViewById(R.id.hinh1);
            holder.imghinh = (ImageView) view.findViewById(R.id.hinh2);
            holder.txtten = (TextView) view.findViewById(R.id.ten1);
            holder.txtten = (TextView) view.findViewById(R.id.ten2);

            view.setTag(holder);
        }
        else    {
            holder = (ViewHolder) view.getTag();
        }
        //gan gia tri
        contact danhsach = danhSachList.get(i);

        holder.txtten.setText(danhsach.getTen());
        holder.imghinh.setImageResource(danhsach.getHinh());

        return view;
    }
}