package com.reactivex.rxjava.app.di


import com.reactivex.rxjava.app.main.MainActivity
import com.reactivex.rxjava.app.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity
}