package com.antoine.business.model

data class Forecast( val location: Location,
                     val current: Day,
                     var forecastDays: List<ForecastDay>)
