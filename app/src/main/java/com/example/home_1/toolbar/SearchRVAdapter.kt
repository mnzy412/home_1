package com.example.home_1.toolbar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home_1.Ppls
import com.example.home_1.databinding.ListItemPplBinding

class SearchRVAdapter(private val searchList: ArrayList<Search>): RecyclerView.Adapter<SearchRVAdapter.DataViewHolder>() {
    inner class DataViewHolder(private val viewBinding: ListItemPplBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind (search: Search) {
            viewBinding.pplTitle.text = search.number
            viewBinding.pplWriter.text = search.keyword
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ListItemPplBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(searchList[position])
    }

    override fun getItemCount(): Int = searchList.size


}