package com.reactivex.rxjava.domain.interactor

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import com.reactivex.rxjava.data.db.entities.Item
import com.reactivex.rxjava.domain.Repo
import javax.inject.Inject

class GetItemsUseCase @Inject constructor(private val cartRepository: Repo){
    fun execute(): LiveData<PagedList<Item>> {
        return cartRepository.getItems()
    }
}