package com.mr.recyclerxcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mr.recyclerxcardview.model.ItemModel;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<ItemModel> rvListData;
    private Context context;

    public ItemAdapter(List<ItemModel> rvListData, Context context) {
        this.rvListData = rvListData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ImageView avatar = holder.ivAvatar;

        avatar.setImageResource(rvListData.get(position).getAvatar());
        holder.tvNama.setText(rvListData.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return rvListData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama;
        private ImageView ivAvatar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tv_nama);
            ivAvatar = itemView.findViewById(R.id.iv_avatar);

        }
    }
}

