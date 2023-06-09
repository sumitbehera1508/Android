package com.example.ex2recycleview

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data:ArrayList<ModelClass>,val context: Context): RecyclerView.Adapter<MyAdapter.holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        val layoutInflater:LayoutInflater = LayoutInflater.from(parent.context)
        val view :View = layoutInflater.inflate(R.layout.single_row, parent,false)
        return holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun deleteItem(i:Int){
        data.removeAt(i)
        notifyDataSetChanged()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun addItem(i:Int, item:ModelClass){
        data.add(i,item)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: holder, position: Int) {
        val temp:ModelClass = data.get(position)

        holder.img.setImageResource(data.get(position).imgnam)
        holder.title.text = data.get(position).header
        holder.desc.text = data.get(position).desc

        //dummy
        holder.dummy.text = "this is a demmo"


        holder.img.setOnClickListener {
            val intent:Intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("imageName",temp.imgnam)
            intent.putExtra("header",temp.header)
            intent.putExtra("desc",temp.desc)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }

        //dummy
        holder.title.setOnClickListener {
            if(holder.dummy.visibility==View.VISIBLE){
                holder.dummy.visibility = View.GONE
            }
            else{
                holder.dummy.visibility=View.VISIBLE
            }
        }
    }
    class holder(itemView:View):RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.img1)
        val title = itemView.findViewById<TextView>(R.id.txt1)
        val desc:TextView = itemView.findViewById(R.id.txt2)


        //
        val dummy = itemView.findViewById<TextView>(R.id.dummy)
    }
}