package  com.antoine.repository.model

import com.google.gson.annotations.SerializedName


data class HourResponse(
        @SerializedName("temp_c") val tempCelsius: Double,
        @SerializedName("temp_f") val tempFahrenheit: Double,
        @SerializedName("is_day") val DayPosition: Int,
        @SerializedName("condition") val condition: ConditionResponse,
        @SerializedName("wind_mph") val windSpeedMph: Double,
        @SerializedName("wind_kph") val windSpeedKph: Double,
        @SerializedName("wind_dir") val windDirection: String,
        @SerializedName("precip_mm") val precipitationMm: Int,
        @SerializedName("precip_in") val precipitationInch: Int,
        @SerializedName("humidity") val humidity: Int,
        @SerializedName("cloud") val cloudLevel: Int,
        @SerializedName("feelslike_c") val feelsLikeCelsius: Double,
        @SerializedName("feelslike_f") val feelsLikeFahrenheit: Double,
        @SerializedName("will_it_rain") val rainPrevisionLevel: Int,
        @SerializedName("will_it_snow") val snowPrevisionLevel: Int
)

