package com.reactivex.rxjava.app.di


import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [CartModule::class])
    abstract fun cartActivity(): CartActivity
}