package com.antoine.kotlin.kotlintest.injection

import com.antoine.kotlin.kotlintest.ui.TodayFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule::class))
interface UIComponent {
    fun inject(todayFragment: TodayFragment)
}