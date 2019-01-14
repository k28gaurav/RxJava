package com.reactivex.rxjava.app.main

import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.reactivex.rxjava.app.base.BaseViewHolder
import com.reactivex.rxjava.data.db.entities.Item
import kotlinx.android.synthetic.main.all_item_adapter.view.*

class AllItemsViewHolder(val view: View, val onClick : (position:Int) -> Unit): BaseViewHolder<Item>(view) {

    init {
        view.setOnClickListener {
            onClick.invoke(adapterPosition)
        }
    }

    override fun setData(data: Item) {
        view.tv_item_name.text = data.title
        Glide.with(view.context)
                .load(data.thumbnailUrl)
                .apply(RequestOptions().centerCrop())
                .into(view.iv_item)
    }
}