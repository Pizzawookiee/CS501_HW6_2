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
    private lateinit var scenario: ActivityScenario<MainActivity>

    // https://stackoverflow.com/a/21810126
    @Before
    fun setUp() {
        scenario = launch(MainActivity::class.java)
//        Log.d("start",Locale.getDefault().getCountry())
//        Log.d("start",Locale.getDefault().getLanguage())
//        val locale = Locale("ENGLISH","CANADA")
//        Locale.setDefault(Locale.FRANCE)
//        val resources = Resources.getSystem()
//        val configuration = resources.configuration
////        configuration.setLocale(Locale.FRANCE)
//        resources.updateConfiguration(configuration, resources.displayMetrics)
    }

    @Test
    fun testEnglishLocale() {
        Locale.setDefault(Locale.ENGLISH)
        onView(withId(R.id.new_crime)).perform(click())
        Thread.sleep(5000)
    }

    @Test
    fun testGermanyLocale() {
        Locale.setDefault(Locale.GERMANY)
        onView(withId(R.id.new_crime)).perform(click())
        Thread.sleep(5000)
    }

    @Test
    fun testFranceLocale() {
        Locale.setDefault(Locale.FRANCE)
        onView(withId(R.id.new_crime)).perform(click())
        Thread.sleep(5000)
    }

    @After
    fun tearDown() {
    }
}