package com.reactivex.rxjava.data.db.dao

import android.arch.paging.DataSource
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.reactivex.rxjava.data.db.entities.Item
import io.reactivex.Single

@Dao
interface ItemDao {

    @Query("SELECT * FROM items")
    fun getItems(): DataSource.Factory<Int, Item>

    @Query("SELECT COUNT(*) FROM items")
    fun getItemsCount(): Single<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItems(items: List<Item>) : List<Long>

}