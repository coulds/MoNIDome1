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
import com.example.monidome1.BeanClass.HomeBean;
import com.example.monidome1.BeanClass.YinliaoBean;
import com.example.monidome1.R;

import java.util.ArrayList;
import java.util.List;

public class YinliaoAdapter extends RecyclerView.Adapter<YinliaoAdapter.MyYinliaoHolder> {
    private String Str = "扔物线";
    private String Str1 = "xiaoyang";
    private Context context;
//    private List<YinliaoBean.ResultBean> liniaodata = new ArrayList<>();
    private List<HomeBean.DataBean.DatasBean> liniaodata = new ArrayList<>();
   public YinliaoAdapter(Context context , List<HomeBean.DataBean.DatasBean> liniaodata){
        this.context = context;
        this.liniaodata = liniaodata;

    }




    @NonNull
    @Override
    public YinliaoAdapter.MyYinliaoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View yinliaoinflate = LayoutInflater.from(context).inflate(R.layout.home_item,parent,false);
        return new MyYinliaoHolder(yinliaoinflate);

    }

    @Override
    public void onBindViewHolder(@NonNull YinliaoAdapter.MyYinliaoHolder holder, int position) {
//        Glide.with(context).load(liniaodata.get(position).getImage()).into(holder.img);

        holder.mArticleAuthor.setText("作者："+liniaodata.get(position).getAuthor());
        holder.mArticleContent.setText(liniaodata.get(position).getTitle());
        holder.mArticleType.setText("分类："+liniaodata.get(position).getChapterName()+"/"+liniaodata.get(position).getSuperChapterName());
        holder.mArticleDate.setText(liniaodata.get(position).getNiceDate());

        if (Str.equals(liniaodata.get(position).getAuthor())||Str1.equals(liniaodata.get(position).getAuthor())) {
            holder.mTopView.setVisibility(View.VISIBLE);
        }else {
            holder.mTopView.setVisibility(View.GONE);
        }

        if (Str.equals(liniaodata.get(position).getAuthor())||Str1.equals(liniaodata.get(position).getAuthor())) {
            holder.mNewView.setVisibility(View.VISIBLE);
        }

        holder.mQuestionView.setVisibility(View.VISIBLE);
        holder.mQuestionView.setText(liniaodata.get(position).getSuperChapterName());

//        holder.tv1.setText(liniaodata.get(position).get);
//        holder.tv2.setText(liniaodata.get(position).getTitle());
//        holder.tv3.setText(liniaodata.get(position).getPath());


    }

    @Override
    public int getItemCount() {
        return liniaodata.size();
    }
    public void yinliaorefrsh(List<HomeBean.DataBean.DatasBean> yinliaolist){
//        data.clear();
        this.liniaodata.addAll(yinliaolist);
        notifyDataSetChanged();
    }

    public class MyYinliaoHolder extends RecyclerView.ViewHolder {
        TextView mArticleAuthor;
        TextView mArticleContent;
        TextView mArticleType;
        TextView mArticleDate;
        ImageView mCollectView;
        TextView mTopView;
        TextView mNewView;
        TextView mQuestionView;

        ImageView img;
        TextView tv1,tv2,tv3,tv4;

        public MyYinliaoHolder(@NonNull View itemView) {
            super(itemView);
            mCollectView = itemView.findViewById(R.id.item_list_collect);
            mArticleAuthor = itemView.findViewById(R.id.item_home_author);
            mArticleContent = itemView.findViewById(R.id.item_home_content);
            mArticleType = itemView.findViewById(R.id.item_article_type);
            mArticleDate = itemView.findViewById(R.id.item_home_date);
            mTopView = itemView.findViewById(R.id.item_home_top_article);
            mNewView = itemView.findViewById(R.id.item_home_new);
            mQuestionView = itemView.findViewById(R.id.item_home_question);

//            img = itemView.findViewById(R.id.goods_img);
//            tv1 = itemView.findViewById(R.id.goods_time);
//            tv2 = itemView.findViewById(R.id.goods_title);
//            tv3 = itemView.findViewById(R.id.goods_path);


        }
    }




}
