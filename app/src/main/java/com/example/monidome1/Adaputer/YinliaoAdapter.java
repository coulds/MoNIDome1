package com.example.monidome1.Adaputer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.monidome1.BeanClass.Bean;
import com.example.monidome1.BeanClass.YinliaoBean;
import com.example.monidome1.R;

import java.util.ArrayList;
import java.util.List;

public class YinliaoAdapter extends RecyclerView.Adapter<YinliaoAdapter.MyYinliaoHolder> {

    private Context context;
    private List<YinliaoBean.ResultBean> liniaodata = new ArrayList<>();
   public YinliaoAdapter(Context context , List<YinliaoBean.ResultBean> liniaodata){
        this.context = context;
        this.liniaodata = liniaodata;

    }




    @NonNull
    @Override
    public YinliaoAdapter.MyYinliaoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View yinliaoinflate = LayoutInflater.from(context).inflate(R.layout.item_yinliao,parent,false);
        return new MyYinliaoHolder(yinliaoinflate);

    }

    @Override
    public void onBindViewHolder(@NonNull YinliaoAdapter.MyYinliaoHolder holder, int position) {
        Glide.with(context).load(liniaodata.get(position).getImage()).into(holder.img);
        holder.tv1.setText(liniaodata.get(position).getPasstime());
        holder.tv2.setText(liniaodata.get(position).getTitle());
        holder.tv3.setText(liniaodata.get(position).getPath());


    }

    @Override
    public int getItemCount() {
        return liniaodata.size();
    }
    public void yinliaorefrsh(List<YinliaoBean.ResultBean> yinliaolist){
//        data.clear();
        this.liniaodata.addAll(yinliaolist);
        notifyDataSetChanged();
    }

    public class MyYinliaoHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv1,tv2,tv3,tv4;

        public MyYinliaoHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.goods_img);
            tv1 = itemView.findViewById(R.id.goods_time);
            tv2 = itemView.findViewById(R.id.goods_title);
            tv3 = itemView.findViewById(R.id.goods_path);


        }
    }




}
