package com.example.howmuch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Result> mData;

    public RecyclerViewAdapter(Context mContext, List<Result> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_result, parent, false);
        MyViewHolder vHolder = new MyViewHolder(view);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_amountOfGrams.setText(String.valueOf(mData.get(position).getAmountOfGrams()));
        holder.tv_amountOfJoints.setText(String.valueOf(mData.get(position).getAmountOfJoints()));
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_amountOfGrams;
        private TextView tv_amountOfJoints;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_amountOfGrams = itemView.findViewById(R.id.amount_result);
            tv_amountOfJoints = itemView.findViewById(R.id.amount_j_result);
            img = itemView.findViewById(R.id.img_result);
        }
    }

}
