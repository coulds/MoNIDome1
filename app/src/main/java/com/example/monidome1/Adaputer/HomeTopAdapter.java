package com.example.monidome1.Adaputer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monidome1.Bean.HomeBean;
import com.example.monidome1.Bean.HomeTopBean;
import com.example.monidome1.R;
import com.example.monidome1.util.JumpWebUtils;

import java.util.ArrayList;
import java.util.List;

public class HomeTopAdapter extends RecyclerView.Adapter<HomeTopAdapter.MyHolder> {
    private Context context;
    private List<HomeTopBean.DataBean> data = new ArrayList<>();

    public HomeTopAdapter(Context context,List<HomeTopBean.DataBean> data){
        this.context = context;
       this.data =data;

    }
    @NonNull
    @Override
    public HomeTopAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflat = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false);
        return new MyHolder(inflat);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeTopAdapter.MyHolder holder, int position) {


        for (int i=0;i<data.size();i++){
            if (data.get(position).getAuthor().equals("")){
                holder.mArticleAuthor.setText("作者："+data.get(position).getShareUser());
            }else {
                holder.mArticleAuthor.setText("作者："+data.get(position).getAuthor());
            }
        }

        holder.itemView.setOnClickListener(view -> JumpWebUtils.startWebView(context,
                data.get(position).getTitle(),
                data.get(position).getLink()));
        holder.mArticleContent.setText(data.get(position).getTitle());

        holder.mTopView.setVisibility(View.VISIBLE);
        holder.mNewView.setVisibility(View.VISIBLE);
        holder.mQuestionView.setVisibility(View.VISIBLE);

        holder.mArticleType.setText("分类："+data.get(position).getChapterName()+"/"+data.get(position).getSuperChapterName());
        holder.mArticleDate.setText(data.get(position).getNiceDate());

        holder.mQuestionView.setText(data.get(position).getSuperChapterName());

    }

    @Override
    public int getItemCount() {
        return data.size();
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
