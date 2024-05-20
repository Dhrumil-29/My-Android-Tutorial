package com.spiderverse.myandroidtutorial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.spiderverse.myandroidtutorial.ButtonList
import com.spiderverse.myandroidtutorial.databinding.RowButtonBinding
import com.spiderverse.myandroidtutorial.utils.Utils

class HomeAdapter(
    private val list: List<ButtonList>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    inner class HomeViewHolder(view: RowButtonBinding) : RecyclerView.ViewHolder(view.root) {
        private val btnText: TextView = view.tvText

        fun bind(buttonList: ButtonList) {
            Utils.setText(btnText, buttonList.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = RowButtonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}