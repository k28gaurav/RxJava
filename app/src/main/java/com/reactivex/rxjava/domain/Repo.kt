package com.reactivex.rxjava.domain

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import com.reactivex.rxjava.data.db.entities.Item
import io.reactivex.Single

interface Repo {
    fun getItems(): LiveData<PagedList<Item>>

    fun fetchItems(): Single<List<Item>>

    fun saveAllItems(items: List<Item>)

    fun clearItem(): Single<Any>
}