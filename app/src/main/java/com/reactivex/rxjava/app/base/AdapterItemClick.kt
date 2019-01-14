package com.reactivex.rxjava.app.base

interface AdapterItemClick<T> {

    fun onItemClick(viewType: Int, data:T)
}