package com.antoine.kotlin.kotlintest.model

import com.google.gson.annotations.SerializedName

data class Condition(@SerializedName("text") val description: String,
                     @SerializedName("icon") val iconUrl: String,
                     @SerializedName("code") val code: Int
)
