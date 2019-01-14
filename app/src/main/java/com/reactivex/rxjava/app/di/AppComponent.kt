package com.reactivex.rxjava.app.di

import android.app.Application
import com.reactivex.rxjava.app.common.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
                      AndroidSupportInjectionModule::class,
                      ViewModelModule::class,
                      DataModule::class,
                      AndroidInjectionModule::class,
                      AppActivityBindingModule::class])
interface AppComponent: AndroidInjector<CartApplication>{
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}