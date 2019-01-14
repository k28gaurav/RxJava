package com.reactivex.rxjava.data.di

import android.arch.persistence.room.Room
import android.content.Context
import com.reactivex.rxjava.app.utils.Constants
import com.reactivex.rxjava.data.db.AppDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideCartDatabase(context: Context): AppDb {
        return Room.databaseBuilder(context.applicationContext,
                AppDb::class.java,
                Constants.DB_NAME).build()
    }
}