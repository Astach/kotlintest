package  com.antoine.repository.model

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
        @SerializedName("location") val location: LocationResponse,
        @SerializedName("current") val currentDay: DayResponse,
        @SerializedName("forecast") val forecast: ForecastResponse)