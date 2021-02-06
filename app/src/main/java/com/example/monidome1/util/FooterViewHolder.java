package com.example.monidome1.util;

import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monidome1.R;

public class FooterViewHolder extends RecyclerView.ViewHolder {

    ProgressBar rcvLoadMore;

    public FooterViewHolder(@NonNull View itemView) {
        super(itemView);
        rcvLoadMore = itemView.findViewById(R.id.load_more_bar);

    }
}
