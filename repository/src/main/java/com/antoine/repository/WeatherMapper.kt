package com.antoine.repository

import com.antoine.business.model.*
import com.antoine.repository.model.*

/**
 * Created by antoine on 7/22/17.
 */
class WeatherMapper {
    fun mapFromResponse(forecastResponse: ForecastResponse): Forecast {
        return Forecast(mapLocation(forecastResponse.location),
                mapDay(forecastResponse.current),
                mapForecastDays(forecastResponse.forecastDays))
    }

    private fun mapLocation(locationResponse: LocationResponse): Location {
        return Location(locationResponse.name,
                locationResponse.region,
                locationResponse.country,
                locationResponse.latitude,
                locationResponse.longitude,
                locationResponse.timezone,
                locationResponse.localtime)
    }

    private fun mapDay(dayResponse: DayResponse): Day {
        return Day(
                dayResponse.maxTempCelsius,
                dayResponse.maxTempFahrenheit,
                dayResponse.minTempCelsius,
                dayResponse.minTempFahrenheit,
                dayResponse.avgTempCelsius,
                dayResponse.avgTempFahrenheit,
                dayResponse.feelsLikeCelsius,
                dayResponse.feelsLikeFahrenheit,
                dayResponse.maxWindSpeedMph,
                dayResponse.maxWindSpeedKph,
                dayResponse.totalPrecipitationMm,
                dayResponse.totalPrecipitationInch,
                dayResponse.avgHumidity,
                mapCondition(dayResponse.condition))

    }

    private fun mapCondition(conditionResponse: ConditionResponse): Condition {
        return Condition(conditionResponse.description, conditionResponse.iconUrl, conditionResponse.code)
    }

    private fun mapForecastDays(forecastDays: List<ForecastDayResponse>): List<ForecastDay> {
        val list = mutableListOf<ForecastDay>()
        forecastDays.forEach { list.add(mapForecastDay(it)) }
        return list
    }

    private fun mapForecastDay(forecastDayResponse: ForecastDayResponse): ForecastDay {
        return ForecastDay(mapDay(forecastDayResponse.day),
                mapAstro(forecastDayResponse.astro),
                mapHours(forecastDayResponse.hours))
    }

    private fun mapAstro(astroResponse: AstroResponse): Astro {
        return Astro(astroResponse.sunrise, astroResponse.sunset, astroResponse.moonrise, astroResponse.moonset)
    }

    private fun mapHours(hours: List<HourResponse>): List<Hour> {
        val list = mutableListOf<Hour>()
        hours.forEach { list.add(mapHour(it)) }
        return list
    }

    private fun mapHour(hourResponse: HourResponse): Hour {
        return Hour(
                hourResponse.tempCelsius,
                hourResponse.tempFahrenheit,
                hourResponse.DayPosition,
                mapCondition(hourResponse.condition),
                hourResponse.windSpeedMph,
                hourResponse.windSpeedKph,
                hourResponse.windDirection,
                hourResponse.precipitationMm,
                hourResponse.precipitationInch,
                hourResponse.humidity,
                hourResponse.cloudLevel,
                hourResponse.feelsLikeCelsius,
                hourResponse.feelsLikeFahrenheit,
                hourResponse.rainPrevisionLevel,
                hourResponse.snowPrevisionLevel
        )
    }

}