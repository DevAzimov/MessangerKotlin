package com.magicapp.messagerkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.magicapp.messagerkotlin.R
import com.magicapp.messagerkotlin.model.Room


class RoomAdapter(var context: Context, var items: ArrayList<Room>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_room_view, parent, false)
        return RoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var room = items[position]

        if (holder is RoomViewHolder){
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            iv_profile.setImageResource(room.profile)
            tv_fullname.text = room.fullname
        }
    }

    class RoomViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_picture)
            tv_fullname = view.findViewById(R.id.tv_name)
        }
    }
}