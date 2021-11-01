package com.hashir.android.modules.curatedList.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hashir.android.R
import com.hashir.android.databinding.HolderClothingItemGridViewBinding
import com.hashir.android.databinding.HolderCuratedPhotoItemBinding
import com.hashir.android.modules.curatedList.diffUtils.CuratedListDiffUtil
import com.hashir.android.modules.curatedList.model.Photo
import com.hashir.android.util.loadImageUsingUrl


class CuratedListAdapter(var layoutManager: GridLayoutManager) :
    PagingDataAdapter<Photo, RecyclerView.ViewHolder>(
        CuratedListDiffUtil()
    ) {

    enum class ViewType {
        LIST, GRID
    }

    var itemClick: ((Photo) -> Unit)? = null
    var saveClick: ((Photo) -> Unit)? = null

    inner class ListViewHolder(val binding: HolderCuratedPhotoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemClick: ((Photo) -> Unit)? = null

        var saveClick: ((Photo) -> Unit)? = null

        fun bindView(photo: Photo?) {
            photo?.let {


                binding.ivCuratedPhoto.loadImageUsingUrl(url = photo.large)
                binding.tvPhotographerName.text = "@" + photo.photographerName

                binding.tvSave.setOnClickListener {
                    saveClick?.invoke(photo)
                }

                binding.ivCuratedPhoto.setOnClickListener {
                    itemClick?.invoke(photo)
                }
            }

        }
    }


    inner class GridViewHolder(val binding: HolderClothingItemGridViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemClick: ((Photo) -> Unit)? = null

        fun bindView(clothingItem: Photo?) {
            /*clothingItem?.let {
                binding.tvItemName.text = clothingItem.title ?: ""
                binding.tvOriginalPrice.text = clothingItem.originalPrice ?: ""
                binding.tvSalePrice.text = clothingItem.salePrice ?: ""

                clothingItem.images?.let { imagesList ->
                    //if (imagesList.isNotEmpty())
                     //   binding.ivImageView.loadImageUsingUrl(url = imagesList[0])
                }

                binding.parentLayout.setOnClickListener {
                    itemClick?.invoke(clothingItem)
                }
            }*/
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        when (layoutManager.spanCount) {
            1 -> {
                (holder as ListViewHolder).bindView(photo = item)
            }
            else -> {
                (holder as GridViewHolder).bindView(clothingItem = item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var viewHolder: RecyclerView.ViewHolder? = null

        when (viewType) {
            ViewType.LIST.ordinal -> {
                viewHolder = ListViewHolder(
                    DataBindingUtil.inflate(
                        inflater,
                        R.layout.holder_curated_photo_item,
                        parent,
                        false
                    )
                ).apply {
                    itemClick = { clothingItem ->
                        this@CuratedListAdapter.itemClick?.invoke(clothingItem)
                    }
                    saveClick = {
                        this@CuratedListAdapter.saveClick?.invoke(it)
                    }

                }
            }

            ViewType.GRID.ordinal -> {
                viewHolder = GridViewHolder(
                    DataBindingUtil.inflate(
                        inflater,
                        R.layout.holder_clothing_item_grid_view,
                        parent,
                        false
                    )
                ).apply {
                    itemClick = { photo ->
                        this@CuratedListAdapter.itemClick?.invoke(photo)
                    }
                    saveClick = { photo ->
                        this@CuratedListAdapter.saveClick?.invoke(photo)

                    }

                }
            }
        }
        return viewHolder!!

    }

    override fun getItemViewType(position: Int): Int {
        return if (layoutManager.spanCount == 1) ViewType.LIST.ordinal
        else ViewType.GRID.ordinal
    }
}