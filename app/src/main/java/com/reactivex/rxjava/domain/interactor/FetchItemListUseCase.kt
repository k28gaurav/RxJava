package com.reactivex.rxjava.domain.interactor


import com.reactivex.rxjava.data.db.entities.Item
import com.reactivex.rxjava.domain.Repo
import io.reactivex.Single
import javax.inject.Inject

class FetchItemListUseCase @Inject constructor(private val repo: Repo) {
    fun execute(): Single<List<Item>> {
        return repo.fetchItems()
    }
}