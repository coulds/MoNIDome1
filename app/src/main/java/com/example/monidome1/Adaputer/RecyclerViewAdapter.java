package com.example.monidome1.Adaputer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monidome1.BeanClass.Bean;
import com.example.monidome1.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context context;
    private List<Bean.DateBean> data = new ArrayList<>();


    public RecyclerViewAdapter(Context context, List<Bean.DateBean> data) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tv1.setText(data.get(position).getTitle());
        holder.tv2.setText(data.get(position).getId());
        holder.tv4.setText(data.get(position).getCollect_num());
        holder.tv3.setText(data.get(position).getFood_str());
        Picasso.with(context).load(data.get(position).getPic()).into(holder.im);
    }


    @Override
    public int getItemCount() {
        return data.size();

    }
    public void refrsh(List<Bean.DateBean> list){
//        data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView tv1,tv2,tv3,tv4;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            im = itemView.findViewById(R.id.imageView);
            tv1 = itemView.findViewById(R.id.textView1);
            tv2 = itemView.findViewById(R.id.textView2);
            tv3 = itemView.findViewById(R.id.textView3);
            tv4 = itemView.findViewById(R.id.textView4);
        }
    }
}
