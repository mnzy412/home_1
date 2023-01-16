package com.example.home_1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.home_1.databinding.ListItemTtlBinding

class TtlRVAdapter(private val ttlList:ArrayList<Ttls>) : RecyclerView.Adapter<TtlRVAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val viewBinding: ListItemTtlBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(ttls: Ttls) {
            viewBinding.ttlTitle.text = ttls.title
            viewBinding.ttlWriter.text = ttls.writer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
       val viewBinding = ListItemTtlBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(ttlList[position])
    }

    override fun getItemCount(): Int = ttlList.size


}