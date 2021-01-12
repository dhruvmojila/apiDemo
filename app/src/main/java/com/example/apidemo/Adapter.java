package com.example.apidemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {

    private List<Pojo> dataList;
    private Context context;

    public Adapter(Context context, List<Pojo> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.design, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.postId.setText(dataList.get(position).getPostId());
        holder.Id.setText(dataList.get(position).getId());
        holder.names.setText(dataList.get(position).getName());
        holder.emails.setText(dataList.get(position).getEmail());
        holder.posts.setText(dataList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView names, posts , emails , postId, Id;

        CustomViewHolder(View itemView) {
            super(itemView);

            postId = itemView.findViewById(R.id.postId);
            Id = itemView.findViewById(R.id.Id);
            names = itemView.findViewById(R.id.name);
            emails = itemView.findViewById(R.id.email);
            posts = itemView.findViewById(R.id.body);
        }
    }
}