package com.example.home_1

import android.util.Log
import android.view.LayoutInflater
import android.view.View.inflate
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home_1.databinding.ListItemPplBinding


class PplRVAdapter (private val pplList: ArrayList<Ppls>): RecyclerView.Adapter<PplRVAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val viewBinding: ListItemPplBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(ppls: Ppls) {
            viewBinding.pplTitle.text = ppls.title
            viewBinding.pplWriter.text = ppls.writer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PplRVAdapter.DataViewHolder {
        val viewBinding = ListItemPplBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: PplRVAdapter.DataViewHolder, position: Int) {
       holder.bind(pplList[position])
    }

    override fun getItemCount(): Int = pplList.size
}