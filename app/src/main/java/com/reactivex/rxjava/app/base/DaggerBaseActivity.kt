package com.reactivex.rxjava.app.base

import android.view.View
import dagger.android.support.DaggerAppCompatActivity


/**
 * this is base activity ,maintain the base behaviour
 */
abstract class DaggerBaseActivity<VM : BaseViewModel>: DaggerAppCompatActivity(), View.OnClickListener {

    protected lateinit var viewModel: VM

    protected fun setStatusBarColor() {

    }

    protected open fun initViews() {
        initAnimations()
        initEventHandlers()
    }

    protected open fun initAnimations() {


    }

    protected open fun initEventHandlers() {

    }

    open fun observeViewModel() {

    }

    override fun onClick(v: View?) {

    }
}