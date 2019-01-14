package com.reactivex.rxjava.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.reactivex.rxjava.data.db.dao.ItemDao
import com.reactivex.rxjava.data.db.entities.Item

@Database(entities = [Item::class], version = 1)
abstract class AppDb: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}