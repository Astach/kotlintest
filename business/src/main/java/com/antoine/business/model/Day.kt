package com.antoine.business.model


data class Day(
        val maxTempCelsius: Double,
        val maxTempFahrenheit: Double,
        val minTempCelsius: Double,
        val minTempFahrenheit: Double,
        val avgTempCelsius: Double,
        val avgTempFahrenheit: Double,
        val feelsLikeCelsius: Double,
        val feelsLikeFahrenheit: Double,
        val maxWindSpeedMph: Double,
        val maxWindSpeedKph: Double,
        val totalPrecipitationMm: Double,
        val totalPrecipitationInch: Double,
        val avgHumidity: Double,
        val condition: Condition
)