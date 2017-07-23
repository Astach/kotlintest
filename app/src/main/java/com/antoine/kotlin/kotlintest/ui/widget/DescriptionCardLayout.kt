package com.antoine.kotlin.kotlintest.ui.widget

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.antoine.business.model.Forecast
import com.antoine.kotlin.kotlintest.R
import com.squareup.picasso.Picasso

/**
 * Created by Antoine Promerova on 6/5/17.
 */
class DescriptionCardLayout : ConstraintLayout {

    private val description: TextView
    private val temperature: TextView
    private var humidity: TextView
    private var image: ImageView

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        LayoutInflater.from(context).inflate(R.layout.description_card_layout, this)

        description = findViewById(R.id.description_field) as TextView
        temperature = findViewById(R.id.temp_field) as TextView
        humidity = findViewById(R.id.humidity_field) as TextView
        image = findViewById(R.id.image_view) as ImageView
    }

    constructor(context: Context?) : this(context, null)

    fun setWeather(forecast: Forecast) {
        description.text = forecast.current.condition.description
        temperature.text = resources.getString(R.string.temperature, forecast.current.maxTempCelsius)
        humidity.text = resources.getString(R.string.humidity, forecast.current.avgHumidity, "%")
        Picasso.with(context).load("https:" + forecast.current.condition.iconUrl).into(image)
    }


}