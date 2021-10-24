package com.myfistapp.login_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class DanhMucConAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<classdanhmuccon> danhmucList;

    public DanhMucConAdapter(Context context, int layout, List<classdanhmuccon> danhmucList){
        this.context = context;
        this.layout = layout;
        this.danhmucList = danhmucList;
    }

    @Override
    public int getCount() {
        return danhmucList.size();
    }

    @Override
    public Object getItem(int i) {
        return danhmucList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imghinh1, imghinh2;
        TextView tvtext1, tvtext2;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();

            //ánh xạ view
            holder.imghinh1 = (ImageView) view.findViewById(R.id.hinh1);
            holder.tvtext1 = (TextView) view.findViewById(R.id.ten1);
            holder.imghinh2 = (ImageView) view.findViewById(R.id.hinh2);
            holder.tvtext2 = (TextView) view.findViewById(R.id.ten2);

            view.setTag(holder);
        }
        else    {
            holder = (ViewHolder) view.getTag();
        }
        //gan gia tri
        classdanhmuccon danhsach = danhmucList.get(i);

        holder.imghinh1.setImageResource(danhsach.getHinh1());
        holder.tvtext1.setText(danhsach.getTen1());
        holder.imghinh2.setImageResource(danhsach.getHinh2());
        holder.tvtext2.setText(danhsach.getTen2());

        return view;
    }
}
