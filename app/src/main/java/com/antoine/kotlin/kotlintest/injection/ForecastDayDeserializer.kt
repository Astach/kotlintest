package com.antoine.kotlin.kotlintest.injection

import com.antoine.kotlin.kotlintest.model.ForecastDay
import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class ForecastDayDeserializer : JsonDeserializer<com.antoine.kotlin.kotlintest.model.Forecast> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): com.antoine.kotlin.kotlintest.model.Forecast? {
        val gson = Gson()
        val forecast = gson.fromJson<com.antoine.kotlin.kotlintest.model.Forecast>(json, typeOfT)
        val content = json?.asJsonObject?.get(forecastKey)?.asJsonObject?.get(forecastDayKey)

        forecast.forecastDays = gson.fromJson<List<ForecastDay>>(content, object : TypeToken<List<ForecastDay>>() {}.type)

        // Deserialize it. You use a new instance of Gson to avoid infinite recursion
        // to this deserializer
        return forecast
    }

    companion object JSON_KEYS {
        private val forecastKey: String = "forecast"
        private val forecastDayKey: String = "forecastday"
    }
}

