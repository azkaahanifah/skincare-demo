package com.dilla.flopalle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dilla.flopalle.R
import com.dilla.flopalle.model.BeautyDiy

class BeautyDiyAdapter(private val listDiy: ArrayList<BeautyDiy>) : RecyclerView.Adapter<BeautyDiyAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.beauty_with_diy, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDiy.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val diy = listDiy[position]

        Glide.with(holder.itemView.context)
            .load(diy.photo)
            .apply(RequestOptions().override(80, 90))
            .into(holder.productImage)

        holder.productName.text = diy.productName
        holder.productDetail.text = diy.productDetail

        holder.btnReadMore.setOnClickListener() {
            onItemClickCallback.onItemClick(listDiy[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productName: TextView = itemView.findViewById(R.id.product_name)
        var productDetail: TextView = itemView.findViewById(R.id.product_detail)
        var productImage: ImageView = itemView.findViewById(R.id.img_photo_diy)
        var btnReadMore: Button = itemView.findViewById(R.id.btn_read_more)
    }

    interface OnItemClickCallback {
        fun onItemClick(data: BeautyDiy)
    }

}