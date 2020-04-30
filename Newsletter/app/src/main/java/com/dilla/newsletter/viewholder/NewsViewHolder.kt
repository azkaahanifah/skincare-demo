package com.dilla.newsletter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_layout_news.view.*

class NewsViewHolder(iitemView: View) : RecyclerView.ViewHolder(iitemView) {
    val title = itemView.title_list
    val body = itemView.body_list
    val date = itemView.date_list
    val btnUpdate = itemView.update
    val btnDelete = itemView.btn_delete
}