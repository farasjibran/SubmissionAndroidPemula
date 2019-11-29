package com.example.kumpulansmadepok;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSchoolAdapter extends RecyclerView.Adapter<ListSchoolAdapter.ListViewHolder> {
    private ArrayList<School> listSchool;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListSchoolAdapter(ArrayList<School> list) {
        this.listSchool = list;
    }

    @NonNull
    @Override
    public ListSchoolAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_school, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListSchoolAdapter.ListViewHolder holder, int position) {
        School school = listSchool.get(position);
        Glide.with(holder.itemView.getContext())
                .load(school.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(school.getName());
        holder.tvDetail.setText(school.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSchool.get(holder.getAdapterPosition()));
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class)
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSchool.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(School data);
    }
}
