package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.SerializedName

data class Location(
        @SerializedName("name") val name: String,
        @SerializedName("region") val region: String,
        @SerializedName("country") val country: String,
        @SerializedName("lat") val latitude: String,
        @SerializedName("lon") val longitude: String,
        @SerializedName("tz_id") val timezone: String,
        @SerializedName("localtime") val localtime: String
)