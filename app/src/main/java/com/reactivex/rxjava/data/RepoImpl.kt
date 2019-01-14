package com.reactivex.rxjava.data

import android.arch.lifecycle.LiveData
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.reactivex.rxjava.app.rx.SchedulersFacade
import com.reactivex.rxjava.data.db.AppDb
import com.reactivex.rxjava.data.db.entities.Item
import com.reactivex.rxjava.domain.Repo
import io.reactivex.Single
import javax.inject.Inject

class RepoImpl @Inject constructor(private val appDb: AppDb,
                                   private val apiService: ApiService,
                                   private val schedulersFacade: SchedulersFacade): Repo {
    override fun getItems(): LiveData<PagedList<Item>> {
        return LivePagedListBuilder(appDb.itemDao().getItems(), 20).build()
    }

    override fun fetchItems(): Single<List<Item>> {
        return apiService.getAllItems()
    }

    override fun saveAllItems(items: List<Item>) {
        appDb.itemDao().insertItems(items)
    }
}
