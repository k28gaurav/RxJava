package com.reactivex.rxjava.data

import com.reactivex.rxjava.data.db.entities.Item
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/photos")
    fun getAllItems(): Single<List<Item>>
}