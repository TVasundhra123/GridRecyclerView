package com.example.gridrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class GridAdapter(private val items: ArrayList<GridItems>): Adapter<GridViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}