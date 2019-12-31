package com.example.recyclerview26112019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonanAdapter extends RecyclerView.Adapter<MonanAdapter.MonanViewHolder>{

    private ArrayList<Monan> mArrayMonans;

    public MonanAdapter(ArrayList<Monan> mArrayMonans) {
        this.mArrayMonans = mArrayMonans;
    }

    @NonNull
    @Override
    public MonanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_monan,parent,false);
        return new MonanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonanViewHolder holder, int position) {
        Monan monan = mArrayMonans.get(position);
        holder.mIvMonan.setImageResource(monan.getHinhanh());
        holder.mTvGia.setText("$ "+monan.getGia());
        holder.mTvTen.setText(monan.getTen());
        holder.mTvMota.setText(monan.getMota());
    }

    @Override
    public int getItemCount() {
        return mArrayMonans!= null ? mArrayMonans.size() : 0;
    }

    class MonanViewHolder extends RecyclerView.ViewHolder{

        ImageView mIvMonan;
        TextView mTvTen,mTvGia,mTvMota;

        public MonanViewHolder(@NonNull View itemView) {
            super(itemView);
            mIvMonan = itemView.findViewById(R.id.ivMonan);
            mTvTen = itemView.findViewById(R.id.tvTenMonan);
            mTvGia = itemView.findViewById(R.id.tvGiaMonan);
            mTvMota = itemView.findViewById(R.id.tvMotaMonan);
        }
    }
}
