package com.reactivex.rxjava.app.di

import android.app.Application
import android.content.Context
import com.reactivex.rxjava.app.rx.SchedulerProvider
import com.reactivex.rxjava.app.rx.SchedulersFacade
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(appliction: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulerProvider
}