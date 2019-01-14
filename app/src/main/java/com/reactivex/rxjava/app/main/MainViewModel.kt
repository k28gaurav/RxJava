package com.reactivex.rxjava.app.main

import com.reactivex.rxjava.app.base.BaseViewModel
import com.reactivex.rxjava.app.rx.SchedulersFacade
import com.reactivex.rxjava.domain.interactor.FetchItemListUseCase
import com.reactivex.rxjava.domain.interactor.GetItemsUseCase
import com.reactivex.rxjava.domain.interactor.SaveItemsUseCase
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(schedulersFacade: SchedulersFacade,
                                        getItemsUseCase: GetItemsUseCase,
                                        private val fetchItemListUseCase: FetchItemListUseCase,
                                        private val saveItemsUseCase: SaveItemsUseCase):BaseViewModel(schedulersFacade) {

    val itemsLiveData = getItemsUseCase.execute()

    fun fetchItemList() {
        val fetchItemListDisposal = fetchItemListUseCase.execute()
                .subscribeOn(schedulers.io())
                .map { items ->
                    saveItemsUseCase.execute(items)
                }
                .observeOn(schedulers.ui())
                .subscribe({

                }, { err ->
                    Timber.e(err)
                    //TODO: Show error  toast and stop loading
                })

        getCompositeDisposable().add(fetchItemListDisposal)
    }

}