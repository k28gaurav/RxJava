package com.reactivex.rxjava.domain.interactor


import com.reactivex.rxjava.data.db.entities.Item
import com.reactivex.rxjava.domain.Repo
import javax.inject.Inject

class SaveItemsUseCase @Inject constructor(private val cartRepository: Repo) {
    fun execute(items: List<Item>) {
        cartRepository.saveAllItems(items)
    }
}