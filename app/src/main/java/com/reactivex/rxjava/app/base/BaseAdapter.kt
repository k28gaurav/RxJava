package com.reactivex.rxjava.app.base

import android.content.Context
import android.view.ViewGroup

abstract class BaseAdapter<T>(var context: Context){

    abstract fun onBindViewHolder(holder: BaseViewHolder<T>?, dataModel: T)

    abstract fun onCreateViewHolder(parent: ViewGroup?): BaseViewHolder<T>

}