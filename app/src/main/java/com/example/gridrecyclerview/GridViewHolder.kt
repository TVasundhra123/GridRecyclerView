package com.example.gridrecyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textItem: TextView = itemView.findViewById(R.id.textView)
    //val imageItem: TextView = itemView.findViewById(R.id.imageView)
    fun bind(gridItems: GridItems) {
        textItem.text = gridItems.name
       // imageItem.text = gridItems.image.toString()
    }
}