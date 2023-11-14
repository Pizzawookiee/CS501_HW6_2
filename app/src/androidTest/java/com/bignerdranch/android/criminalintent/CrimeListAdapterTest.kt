package com.bignerdranch.android.criminalintent

import android.content.res.Resources
import android.util.Log
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class CrimeListAdapterTest{
//    private lateinit var scenario: ActivityScenario<MainActivity>

    // https://stackoverflow.com/a/21810126
    @Before
    fun setUp() {
//        scenario = launch(MainActivity::class.java)
//        Log.d("start",Locale.getDefault().getCountry())
//        Log.d("start",Locale.getDefault().getLanguage())
//        val locale = Locale("ENGLISH","CANADA")
//        Locale.setDefault(Locale.GERMANY)
//        val resources = Resources.getSystem()
//        val configuration = resources.configuration
////        configuration.setLocale(Locale.FRANCE)
//        resources.updateConfiguration(configuration, resources.displayMetrics)
    }

    @Test
    fun testEnglishLocale() {
        val date  = Date()
        Locale.setDefault(Locale.ENGLISH)
        val sdf = SimpleDateFormat()
        Log.d("en", sdf.format(date).toString())
//        onView(withId(R.id.crime_title)).perform(click())
    }

    @Test
    fun testGermanyLocale() {
        val date  = Date()
        Locale.setDefault(Locale.GERMANY)
        val sdf = SimpleDateFormat()
        Log.d("ge", sdf.format(date).toString())
    }

    @Test
    fun testFranceLocale() {
        val date  = Date()
        Locale.setDefault(Locale.FRANCE)
        val sdf = SimpleDateFormat()
        Log.d("fr", sdf.format(date).toString())
    }

    @After
    fun tearDown() {
    }
}