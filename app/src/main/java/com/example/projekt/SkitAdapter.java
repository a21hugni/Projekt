package com.example.projekt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SkitAdapter extends RecyclerView.Adapter<VyHolder> {

    private List<Grejer> grejer;
    public SkitAdapter(List<Grejer> grejer) {
        this.grejer = grejer;
    }

    @NonNull
    @Override
    public VyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new VyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VyHolder holder, int position) {
        holder.ID.setText(grejer.get(position).getName());
        holder.name.setText(grejer.get(position).getName());
        holder.location.setText(grejer.get(position).getName());
        holder.company.setText(grejer.get(position).getName());
        holder.size.setText(String.valueOf(grejer.get(position).getSize()));
    }

    @Override
    public int getItemCount() {
        return grejer.size();
    }
}

