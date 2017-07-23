package  com.antoine.repository.model


import com.google.gson.annotations.SerializedName


data class DayResponse(
        @SerializedName("maxtemp_c", alternate = arrayOf("temp_c")) val maxTempCelsius: Double,
        @SerializedName("maxtemp_f", alternate = arrayOf("temp_f")) val maxTempFahrenheit: Double,
        @SerializedName("mintemp_c") val minTempCelsius: Double,
        @SerializedName("mintemp_f") val minTempFahrenheit: Double,
        @SerializedName("avgtemp_c") val avgTempCelsius: Double,
        @SerializedName("avgtemp_f") val avgTempFahrenheit: Double,
        @SerializedName("feelslike_c") val feelsLikeCelsius: Double,
        @SerializedName("feelslike_f") val feelsLikeFahrenheit: Double,
        @SerializedName("maxwind_mph", alternate = arrayOf("wind_mph")) val maxWindSpeedMph: Double,
        @SerializedName("maxwind_kph", alternate = arrayOf("wind_kph")) val maxWindSpeedKph: Double,
        @SerializedName("totalprecip_mm", alternate = arrayOf("precip_mm")) val totalPrecipitationMm: Double,
        @SerializedName("totalprecip_in", alternate = arrayOf("precip_in")) val totalPrecipitationInch: Double,
        @SerializedName("avghumidity", alternate = arrayOf("humidity")) val avgHumidity: Double,
        @SerializedName("condition") val condition: ConditionResponse
)