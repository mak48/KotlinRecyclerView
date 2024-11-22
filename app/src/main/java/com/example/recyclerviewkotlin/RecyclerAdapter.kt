package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val names: List<String>, private val ingr: List<String>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cakeName: TextView = itemView.findViewById(R.id.cakeName)
        val ingredients: TextView = itemView.findViewById(R.id.ingredients)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.cakeName.text = names[position]
        holder.ingredients.text = ingr[position]
        val imageResources = arrayOf(R.drawable.medovik, R.drawable.cheesecake, R.drawable.redvelvet,
            R.drawable.birdsmilk, R.drawable.napoleon, R.drawable.carrot, R.drawable.sourcream,
            R.drawable.tiramisu, R.drawable.praga, R.drawable.house)
        holder.imageView.setImageResource(imageResources[position])
    }

    override fun getItemCount() = names.size
}