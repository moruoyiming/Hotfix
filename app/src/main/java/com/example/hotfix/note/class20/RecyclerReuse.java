package com.example.hotfix.note.class20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotfix.R;

import java.util.List;

public class RecyclerReuse extends RecyclerView.Adapter<RecyclerReuse.StarViewHolder> {
    private List<Woman> stars;

    private Context context;

    public RecyclerReuse(List<Woman> stars, Context context) {
        this.stars = stars;
        this.context = context;
    }

    @NonNull
    @Override
    public StarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview, parent, false);
        StarViewHolder starViewHolder = new StarViewHolder(view);
        return starViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StarViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return stars == null ? 0 : stars.size();
    }



    public class StarViewHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public StarViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_name);

        }
    }
}