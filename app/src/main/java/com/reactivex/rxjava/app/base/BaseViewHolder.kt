package com.reactivex.rxjava.app.base

import android.support.v7.widget.RecyclerView
import android.view.View
import timber.log.Timber

abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{

    var adapterCallback: AdapterItemClick<T>?=null
    abstract fun setData(data: T)

    fun setCallbackListener(callback: AdapterItemClick<T>?){
        adapterCallback = callback
    }


    override fun onClick(clickedView: View?) {
    }
}