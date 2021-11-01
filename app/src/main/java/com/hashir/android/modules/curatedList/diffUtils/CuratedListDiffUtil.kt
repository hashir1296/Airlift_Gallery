package com.hashir.android.modules.curatedList.diffUtils

import androidx.recyclerview.widget.DiffUtil
import com.hashir.android.modules.curatedList.model.Photo


class CuratedListDiffUtil() :
    DiffUtil.ItemCallback<Photo>() {
    override fun areItemsTheSame(
        oldItem: Photo,
        newItem: Photo,
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: Photo,
        newItem: Photo,
    ): Boolean {
        return oldItem == (newItem)
    }
}