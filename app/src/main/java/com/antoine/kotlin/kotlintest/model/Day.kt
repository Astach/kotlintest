package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class Day(
        @SerializedName("maxtemp_c") val maxTempCelsius:Double,
        @SerializedName("maxtemp_f") val maxTempFahrenheit:Double,
        @SerializedName("mintemp_c") val minTempCelsius:Double,
        @SerializedName("mintemp_f") val minTempFahrenheit:Double,
        @SerializedName("avgtemp_c") val avgTempCelsius:Double,
        @SerializedName("avgtemp_f") val avgTempFahrenheit:Double,
        @SerializedName("maxwind_mph") val maxWindSpeedMph:Double,
        @SerializedName("maxwind_kph") val maxWindSpeedKph:Double,
        @SerializedName("totalprecip_mm") val totalPrecipitationMm:Int,
        @SerializedName("totalprecip_in") val totalPrecipitationInch:Int,
        @SerializedName("avghumidity") val avgHumidity:Int,
        @SerializedName("condition") val condition: Condition
)