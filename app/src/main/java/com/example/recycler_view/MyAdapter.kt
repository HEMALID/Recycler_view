package com.example.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var arrimg= arrayOf(R.drawable.tom,R.drawable.tom,R.drawable.tom,R.drawable.tom,R.drawable.tom,R.drawable.tom)
    var artitle= arrayOf("Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise")
    var arrsubtitle= arrayOf("Actor","Actor","Actor","Actor","Actor","Actor")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        lateinit var img: ImageView
        lateinit var title: TextView
        lateinit var subtitle: TextView

        init{
            img=itemView.findViewById(R.id.img)
            title=itemView.findViewById(R.id.txt1)
            subtitle=itemView.findViewById(R.id.txt2)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageResource(arrimg[position])
        holder.title.text=artitle[position]
        holder.subtitle.text=arrsubtitle[position]
    }

    override fun getItemCount(): Int {
        return artitle.size
    }
}