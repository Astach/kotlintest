package com.antoine.business.model

data class Hour(
        val tempCelsius: Double,
        val tempFahrenheit: Double,
        val DayPosition: Int,
        val condition: Condition,
        val windSpeedMph: Double,
        val windSpeedKph: Double,
        val windDirection: String,
        val precipitationMm: Int,
        val precipitationInch: Int,
        val humidity: Int,
        val cloudLevel: Int,
        val feelsLikeCelsius: Double,
        val feelsLikeFahrenheit: Double,
        val rainPrevisionLevel: Int,
        val snowPrevisionLevel: Int
)

