package com.hashir.android.modules.home.adapter

class BrandsListingAdapter
    /*ListAdapter<BrandDetailsResponse.Brand, BrandsListingAdapter.ViewHolder>(
        BrandListingDiffUtilCallback) {

    var itemClick: ((BrandDetailsResponse.Brand) -> Unit)? = null


    inner class ViewHolder(val binding: HolderBrandsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemClick: ((BrandDetailsResponse.Brand) -> Unit)? = null

        fun bindView(brand: BrandDetailsResponse.Brand) {
            binding.ivBrandLogo.loadImageUsingBase64(
                base64 = brand.image
            )
            binding.parentLayout.setOnClickListener {
                itemClick?.invoke(brand)
            }
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            holder.bindView(getItem(position))
            executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return ViewHolder(
            DataBindingUtil.inflate(
                inflater,
                R.layout.holder_brands_item,
                parent,
                false
            )
        ).apply {
            itemClick = { brand ->
                this@BrandsListingAdapter.itemClick?.invoke(brand)
            }

        }
    }


    object BrandListingDiffUtilCallback : DiffUtil.ItemCallback<BrandDetailsResponse.Brand>() {


        override fun areItemsTheSame(
            oldItem: BrandDetailsResponse.Brand,
            newItem: BrandDetailsResponse.Brand,
        ): Boolean = oldItem.name == newItem.name

        override fun areContentsTheSame(
            oldItem: BrandDetailsResponse.Brand,
            newItem: BrandDetailsResponse.Brand,
        ): Boolean = oldItem == newItem
    }*/

