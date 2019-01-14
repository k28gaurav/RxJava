package com.reactivex.rxjava.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.content.ClipData
import com.reactivex.rxjava.data.db.dao.ItemDao

@Database(entities = [ClipData.Item::class], version = 1)
abstract class AppDb: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}