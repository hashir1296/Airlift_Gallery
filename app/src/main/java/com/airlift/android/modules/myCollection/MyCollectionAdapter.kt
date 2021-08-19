package com.airlift.android.modules.myCollection

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.airlift.android.R
import com.airlift.android.databinding.HolderCuratedPhotoItemBinding
import com.airlift.android.db.PhotoEntity
import com.airlift.android.util.loadImageUsingUrl

class MyCollectionAdapter(var context: Context) :
    ListAdapter<PhotoEntity, MyCollectionAdapter.ViewHolder>(MyCollectionDiffUtil()) {

    var itemClick: ((PhotoEntity) -> Unit)? = null
    var deleteClick: ((PhotoEntity) -> Unit)? = null

    inner class ViewHolder(val binding: HolderCuratedPhotoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemClick: ((PhotoEntity) -> Unit)? = null
        var deleteClick: ((PhotoEntity) -> Unit)? = null


        fun bindView(photo: PhotoEntity?) {
            photo?.let {
                binding.ivCuratedPhoto.loadImageUsingUrl(url = photo.large)
                binding.tvPhotographerName.text = photo.photographerName ?: ""
                binding.tvSave.text = context.getString(R.string.delete)

                binding.tvSave.setOnClickListener {
                    deleteClick?.invoke(photo)
                }

                binding.ivCuratedPhoto.setOnClickListener {
                    itemClick?.invoke(photo)
                }
            }

        }
    }


    class MyCollectionDiffUtil : DiffUtil.ItemCallback<PhotoEntity>() {
        override fun areItemsTheSame(oldItem: PhotoEntity, newItem: PhotoEntity): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: PhotoEntity, newItem: PhotoEntity): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return ViewHolder(
            DataBindingUtil.inflate(
                inflater,
                R.layout.holder_curated_photo_item,
                parent,
                false
            )
        ).apply {
            itemClick = { photo ->
                this@MyCollectionAdapter.itemClick?.invoke(photo)
            }
            deleteClick = { photo ->
                this@MyCollectionAdapter.deleteClick?.invoke(photo)
            }

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bindView(item)
    }
}

