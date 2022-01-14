package com.example.recviewtoolbarscrolleffect2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewtoolbarscrolleffect2.R
import com.example.recviewtoolbarscrolleffect2.modul.Member

class CustomAdapter(val member:List<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_layout_item,parent,false)
        return CustomViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = member[position]

        if (holder is CustomViewHolder){
            holder.name.text = member.name
            holder.lastName.text = member.lastname
        }


    }

    override fun getItemCount(): Int {
        return member.size
    }
    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view){

        val name = view.findViewById<TextView>(R.id.tv_name)
        val lastName = view.findViewById<TextView>(R.id.tv_lastname)


    }