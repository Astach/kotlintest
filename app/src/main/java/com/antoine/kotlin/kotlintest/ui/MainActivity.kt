package com.antoine.kotlin.kotlintest.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.antoine.kotlin.kotlintest.R

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                navigate()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                navigate()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                navigate()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation: BottomNavigationView = findViewById(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, TodayFragment.newInstance(), TodayFragment.name).commit()
        }
    }

    fun navigate() {

    }
}
