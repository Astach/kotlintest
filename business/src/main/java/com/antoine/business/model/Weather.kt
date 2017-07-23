package com.antoine.business.model


data class Weather(
        val location: Location,
        val currentDay: Day,
        val forecast: Forecast
)