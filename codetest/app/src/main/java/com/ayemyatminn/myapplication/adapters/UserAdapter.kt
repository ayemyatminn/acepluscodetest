package com.ayemyatminn.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayemyatminn.myapplication.R
import com.ayemyatminn.myapplication.delegates.UserActionDelegate
import com.ayemyatminn.myapplication.viewholders.UserViewHolder

class UserAdapter(private val delegate: UserActionDelegate): RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_user,parent,false)
        return UserViewHolder(itemView,delegate)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

    }
}