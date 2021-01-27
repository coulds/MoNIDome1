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
import com.example.monidome1.BeanClass.PictureBean;
import com.example.monidome1.R;

import java.util.ArrayList;
import java.util.List;

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.PictureHolder> {
    private List<PictureBean.DataBean> picturedata = new ArrayList<>();
    private Context context;

    public PictureAdapter(Context context,List<PictureBean.DataBean> picturedata){
        this.context = context;
        this.picturedata = picturedata;
    }
    @NonNull
    @Override
    public PictureHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_fengjing,parent,false);
        return new PictureHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureHolder holder, int position) {
        Glide.with(context).load(picturedata.get(position).getUrl()).into(holder.pic_img);
        holder.pic_total.setText(picturedata.get(position).getFav_total());
        holder.pic_data.setText(picturedata.get(position).getFav_total());
        holder.pic_cid.setText(picturedata.get(position).getCid());
        holder.pic_number.setText(picturedata.get(position).getC_t());

    }

    @Override
    public int getItemCount() {
        return picturedata.size();
    }



    public void refrest(List<PictureBean.DataBean> list){
        this.picturedata.addAll(list);
        notifyDataSetChanged();
    }

    public class PictureHolder extends RecyclerView.ViewHolder {
        TextView pic_data,pic_cid,pic_number,pic_total;
        ImageView pic_img;
        public PictureHolder(@NonNull View itemView) {
            super(itemView);
            pic_total = (TextView) itemView.findViewById(R.id.pic_total);
            pic_cid= (TextView) itemView.findViewById(R.id.pic_cid);
            pic_img = (ImageView) itemView.findViewById(R.id.pic_img);
            pic_number = (TextView) itemView.findViewById(R.id.pic_number);
            pic_data = itemView.findViewById(R.id.pic_data);
        }
    }
}
