package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.SerializedName

data class Forecast(@SerializedName("location") val location: Location,
                    @SerializedName("current") val current: Day,
                    @SerializedName("forecastday") var forecastDays: List<ForecastDay>)
