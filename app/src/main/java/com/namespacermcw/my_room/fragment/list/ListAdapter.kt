package com.namespacermcw.my_room.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.namespacermcw.my_room.R
import com.namespacermcw.my_room.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.txtId.text = currentItem.id.toString()
        holder.itemView.txtFirstName.text = currentItem.firstName
        holder.itemView.txtLastName.text = currentItem.lastName
        holder.itemView.txtAge.text = currentItem.age.toString()
    }

    fun setData(user: List<User>){
        this.userList = user
        notifyDataSetChanged()
    }
}