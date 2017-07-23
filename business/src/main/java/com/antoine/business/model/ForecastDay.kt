package com.antoine.business.model

data class ForecastDay(
        val day: Day,
        val astro: Astro,
        val hours: List<Hour>
)