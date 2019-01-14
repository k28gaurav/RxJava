package com.reactivex.rxjava.app.utils

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun Context.inflateLayout(@LayoutRes layoutId: Int, parent: ViewGroup?, attachToRoot: Boolean): View {
    return LayoutInflater.from(this).inflate(layoutId, parent, attachToRoot)
}