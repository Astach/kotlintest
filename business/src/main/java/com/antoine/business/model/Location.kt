package com.antoine.business.model


data class Location(
        val name: String,
        val region: String,
        val country: String,
        val latitude: String,
        val longitude: String,
        val timezone: String,
        val localtime: String
)