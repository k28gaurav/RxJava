package com.reactivex.rxjava

import com.facebook.stetho.Stetho
import com.reactivex.rxjava.app.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class App : DaggerApplication() {

    lateinit var appComponent: AppComponent
        private set

    companion object {
        lateinit var app: App
            internal set
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent =  DaggerAppComponent.builder().application(this).build()
        return appComponent
    }
}