package com.reactivex.rxjava.data.di

import com.reactivex.rxjava.data.RepoImpl
import com.reactivex.rxjava.domain.Repo
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun provideRepository(cartRepositoryImpl: RepoImpl): Repo

}