package com.example.monidome1.Adaputer;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.monidome1.Bean.ProjectDecBean;
import com.example.monidome1.R;

import java.util.List;

public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.MViewHold> {
    private Context mcontext;
    private List<ProjectDecBean.DataBean.DatasBean> mdata;
    public ProjectListAdapter(Context context, List<ProjectDecBean.DataBean.DatasBean> data){
        this.mcontext = context;
        this.mdata = data;

    }
    @NonNull
    @Override
    public MViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.project_item,parent,false);
        return new MViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHold holder, int position) {
        holder.mProjectAuthor.setText("作者："+mdata.get(position).getAuthor());
        holder.mProjectDate.setText(mdata.get(position).getNiceDate());
        holder.mProjectContent.setText(mdata.get(position).getDesc());
        holder.mProjectTitle.setText(mdata.get(position).getTitle());
        holder.mProjectImageView.setVisibility(View.VISIBLE);
        holder.mItemTop.setVisibility(View.VISIBLE);
        Glide.with(mcontext).load(mdata.get(position).getEnvelopePic()).into(holder.mProjectImageView);
        holder.mProjectType.setText("分类："+mdata.get(position).getChapterName()+"/"+mdata.get(position).getSuperChapterName());

//        holder.mProjectDate.setText(mdata.get(position).getNiceDate());


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MViewHold extends RecyclerView.ViewHolder {
        TextView mProjectAuthor;
        TextView mProjectTitle;
        TextView mProjectType;
        TextView mProjectDate;
        ImageView mProjectImageView;
        TextView mProjectContent;
        ImageView mCollectView;
        TextView mItemTop;

        public MViewHold(@NonNull View itemView) {
            super(itemView);
            mProjectAuthor = itemView.findViewById(R.id.item_project_author);
            mProjectTitle = itemView.findViewById(R.id.item_project_title);
            mProjectType = itemView.findViewById(R.id.item_project_type);
            mProjectDate = itemView.findViewById(R.id.item_project_date);
            mProjectContent = itemView.findViewById(R.id.item_project_content);
            mItemTop = itemView.findViewById(R.id.item_project_top);

            mProjectImageView = itemView.findViewById(R.id.item_project_imageview);
            mCollectView = itemView.findViewById(R.id.item_list_collect);

        }
    }
}
