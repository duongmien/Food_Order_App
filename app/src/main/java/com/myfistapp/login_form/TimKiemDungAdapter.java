package com.myfistapp.login_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TimKiemDungAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<classtimkiemdung> timkiemList;

    public TimKiemDungAdapter(Context context, int layout, List<classtimkiemdung> timkiemList) {
        this.context = context;
        this.layout = layout;
        this.timkiemList = timkiemList;
    }

        @Override
    public int getCount() {
            return timkiemList.size();
    }

    @Override
    public Object getItem(int i) {
        return timkiemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imghinh1, imghinh2;
        TextView tvtext1, tvtext2, tvtext3, tvtext4, tvtext5, tvtext6, tvtext7;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder = new ViewHolder();

            // ánh xạ view
            viewHolder.imghinh1 =(ImageView) view.findViewById(R.id.hinh1);
            viewHolder.tvtext1 = (TextView) view.findViewById(R.id.ten1);
            viewHolder.imghinh2 =(ImageView) view.findViewById(R.id.hinh2);
            viewHolder.tvtext2 = (TextView) view.findViewById(R.id.ten2);
            viewHolder.tvtext3 = (TextView) view.findViewById(R.id.ten3);
            viewHolder.tvtext4 = (TextView) view.findViewById(R.id.ten4);
            viewHolder.tvtext5 = (TextView) view.findViewById(R.id.ten5);
            viewHolder.tvtext6 = (TextView) view.findViewById(R.id.ten6);
            viewHolder.tvtext7 = (TextView) view.findViewById(R.id.ten7);

            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)view.getTag();
        }
        // gan gia tri
        classtimkiemdung timkiem = timkiemList.get(i);

        viewHolder.imghinh1.setImageResource(timkiem.getHinh1());
        viewHolder.tvtext1.setText(timkiem.getText1());
        viewHolder.imghinh2.setImageResource(timkiem.getHinh2());
        viewHolder.tvtext2.setText(timkiem.getText2());
        viewHolder.tvtext3.setText(timkiem.getText3());
        viewHolder.tvtext4.setText(timkiem.getText4());
        viewHolder.tvtext5.setText(timkiem.getText5());
        viewHolder.tvtext6.setText(timkiem.getText6());
        viewHolder.tvtext7.setText(timkiem.getText7());

        return view;
    }
}
