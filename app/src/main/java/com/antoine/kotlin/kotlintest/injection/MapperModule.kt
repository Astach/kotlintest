package com.antoine.kotlin.kotlintest.injection

import com.antoine.repository.WeatherMapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by antoine on 7/23/17.
 */
@Module
class MapperModule {

    @Singleton
    @Provides
    fun provideWeatherMapper(): WeatherMapper {
        return WeatherMapper()
    }
}