package com.ayemyatminn.myapplication.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ayemyatminn.myapplication.delegates.UserActionDelegate

class UserViewHolder(itemView: View, private val delegate: UserActionDelegate): RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            delegate.onTapUser()
        }
    }
}