package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.SerializedName

data class Weather(
        @SerializedName("location") val location: Location,
        @SerializedName("current") val currentDay: Day,
        @SerializedName("forecast") val forecast: Forecast
)