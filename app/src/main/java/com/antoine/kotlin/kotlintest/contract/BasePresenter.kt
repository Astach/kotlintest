package com.antoine.kotlin.kotlintest.contract

interface BasePresenter<in V : BaseView> {
    fun setView(view : V)
}

