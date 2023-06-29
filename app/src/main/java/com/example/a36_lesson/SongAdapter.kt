package com.example.a36_lesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.a36_lesson.databinding.ItemSongBinding

class SongAdapter(val list: ArrayList<Song>,val onClick:(position:Int)->Unit): Adapter<SongAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemSongBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = list[adapterPosition]
            binding.tvName.text = item.name
            binding.tvArtist.text = item.artist
            binding.tvDuration.text = item.duration
            item.image?.let { binding.imgSong.loadImage(it) }

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}