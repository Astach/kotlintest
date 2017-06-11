package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.SerializedName

data class ForecastDay(
        @SerializedName("day") val day: Day,
        @SerializedName("astro") val astro: Astro,
        @SerializedName("hours") val hours: List<Hour>
)