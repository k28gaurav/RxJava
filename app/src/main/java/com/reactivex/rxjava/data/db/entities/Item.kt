package com.reactivex.rxjava.data.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "items")
data class Item(
        @PrimaryKey
        @SerializedName("id")
        @ColumnInfo(name = "id")
        val id: Int,

        @SerializedName("albumId")
        @ColumnInfo(name = "album_id")
        val albumId: Int,

        @SerializedName("title")
        @ColumnInfo(name = "title")
        val title: String,

        @SerializedName("url")
        @ColumnInfo(name = "url")
        val url: String,

        @SerializedName("thumbnailUrl")
        @ColumnInfo(name = "thumbnail_url")
        val thumbnailUrl: String
): Parcelable