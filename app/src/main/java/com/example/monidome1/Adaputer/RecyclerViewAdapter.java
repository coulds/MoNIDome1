package com.example.monidome1.Adaputer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monidome1.BeanClass.Bean;
import com.example.monidome1.BeanClass.HomeBean;
import com.example.monidome1.R;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private String Str = "扔物线";
    private String Str1 = "xiaoyang";
    private Context context;
    private List<HomeBean.DataBean.DatasBean> data = new ArrayList<>();


    public RecyclerViewAdapter(Context context, List<HomeBean.DataBean.DatasBean> data) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false);
        return new MyHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        if (data != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = new Date(System.currentTimeMillis());
            String nowdata = simpleDateFormat.format(date);
            String yesterday = simpleDateFormat.format(new Date(date.getTime() - 1 * 24 * 60 * 60 * 1000));
//            String tomorrow = simpleDateFormat.format(new Date(date.getTime() + 1 * 24 * 60 * 60 * 1000));
            Date d1 = null;
            try {
                d1 = simpleDateFormat.parse(nowdata);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date d2 = null;
            try {
                d2 = simpleDateFormat.parse(yesterday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date d3 = null;
            try {
                d3 = simpleDateFormat.parse(data.get(position).getNiceDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long timediff = d1.getTime() - d2.getTime();
            Log.d("哈哈哈哈哈1", "Data的时间 "+date);
            Log.d("哈哈哈哈哈2", "nowdata "+nowdata);

            holder.mArticleAuthor.setText("作者："+data.get(position).getAuthor());
            holder.mArticleContent.setText(data.get(position).getTitle());
            holder.mArticleType.setText("分类："+data.get(position).getChapterName()+"/"+data.get(position).getSuperChapterName());
            holder.mArticleDate.setText(data.get(position).getNiceDate());

                if (Str.equals(data.get(position).getAuthor())||Str1.equals(data.get(position).getAuthor())) {
                    holder.mTopView.setVisibility(View.VISIBLE);
                }else {
                    holder.mTopView.setVisibility(View.GONE);
                }

            if (Str.equals(data.get(position).getAuthor())||Str1.equals(data.get(position).getAuthor())) {
                holder.mNewView.setVisibility(View.VISIBLE);
            }

            holder.mQuestionView.setVisibility(View.VISIBLE);
            holder.mQuestionView.setText(data.get(position).getSuperChapterName());
        }



//        Picasso.with(context).load(data.get(position).getPic()).into(holder.mCollectView);
    }


    @Override
    public int getItemCount() {
        return data.size();

    }
    public void refrsh(List<HomeBean.DataBean.DatasBean> list){
//        data.clear();
        this.data.addAll(0,list);
        notifyDataSetChanged();
    }
    public void refrshmore(List<HomeBean.DataBean.DatasBean> list,int page){
//        data.clear();
        this.data.addAll(1,list);
        notifyDataSetChanged();
    }

    public class MyHolder extends RecyclerView.ViewHolder {


        TextView mArticleAuthor;
        TextView mArticleContent;
        TextView mArticleType;
        TextView mArticleDate;
        ImageView mCollectView;
        TextView mTopView;
        TextView mNewView;
        TextView mQuestionView;
        ImageView im;
        TextView tv1,tv2,tv3,tv4;

        public MyHolder(@NonNull View itemView) {
            super(itemView);


            mCollectView = itemView.findViewById(R.id.item_list_collect);
            mArticleAuthor = itemView.findViewById(R.id.item_home_author);
            mArticleContent = itemView.findViewById(R.id.item_home_content);
            mArticleType = itemView.findViewById(R.id.item_article_type);
            mArticleDate = itemView.findViewById(R.id.item_home_date);
            mTopView = itemView.findViewById(R.id.item_home_top_article);
            mNewView = itemView.findViewById(R.id.item_home_new);
            mQuestionView = itemView.findViewById(R.id.item_home_question);

        }
    }
}
