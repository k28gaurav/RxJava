package com.reactivex.rxjava.app.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.reactivex.rxjava.R
import com.reactivex.rxjava.app.base.DaggerBaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: DaggerBaseActivity<MainViewModel>(){

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var allItemsAdapter: AllItemsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[MainViewModel::class.java]
        initViews()
    }

    override fun initViews() {
        rv_all_items.layoutManager = LinearLayoutManager(this)
        allItemsAdapter = AllItemsAdapter(this) { position, item ->

        }
        rv_all_items.adapter = allItemsAdapter

        super.initViews()
    }

    override fun observeViewModel() {
        viewModel.itemsLiveData.observe(this, Observer { items ->
            items?.let {
                if(it.size == 0) {
                    viewModel.fetchItemList()
                }
                allItemsAdapter.submitList(items)
            }
        })
    }


}