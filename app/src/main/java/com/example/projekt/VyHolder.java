package com.example.projekt;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VyHolder extends RecyclerView.ViewHolder {
    public TextView ID;
    public TextView name;
    public TextView location;
    public TextView size;
    public TextView company;

    public VyHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        size = itemView.findViewById(R.id.size);
    }

}

