package com.example.hellomyanimalapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataCat(
    val name:String,
    val age:String,
    val breed:String,
    val temperament:String,
    val picture:Int
):Parcelable



