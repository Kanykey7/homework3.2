package com.geektech.homework32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter <NameViewHolder> {

    private ArrayList<String> namelist;

    public NameAdapter(ArrayList<String> namelist) {
        this.namelist = namelist;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(namelist.get(position));
    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }
}
