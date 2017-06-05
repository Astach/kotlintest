package com.antoine.kotlin.kotlintest.widget

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.antoine.kotlin.kotlintest.R

/**
 * Created by Antoine Promerova on 6/5/17.
 */
class DescriptionCardLayout : ConstraintLayout {


    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        LayoutInflater.from(context).inflate(R.layout.description_card_layout, this)

        val description = findViewById(R.id.description_field) as TextView
        val temperature = findViewById(R.id.temp_field) as TextView
        val humidity = findViewById(R.id.humidity_field) as TextView
        val image = findViewById(R.id.image_view) as ImageView
    }

    constructor(context: Context?) : this(context, null)



}