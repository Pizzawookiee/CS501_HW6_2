package com.bignerdranch.android.criminalintent

import android.util.Log
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import android.util.Log.d

class CrimeListAdapterTest {

    @Before
    fun setUp() {
    }

    @Test
    fun testEnglishLocale() {
        val date  = Date()
        Locale.setDefault(Locale.ENGLISH)
        val sdf = SimpleDateFormat()
        System.out.println(sdf.format(date).toString())
//        Log.d("en",sdf.format(date).toString())
    }

    @Test
    fun testGermanyLocale() {
        val date  = Date()
        Locale.setDefault(Locale.GERMANY)
        val sdf = SimpleDateFormat()
        System.out.println(sdf.format(date).toString())
//        Log.d("ge",sdf.format(date).toString())
    }

    @Test
    fun testFranceLocale() {
        val date  = Date()
        Locale.setDefault(Locale.FRANCE)
        val sdf = SimpleDateFormat()
        System.out.println(sdf.format(date).toString())
//        Log.d("fr",sdf.format(date).toString())
    }

    @After
    fun tearDown() {
    }
}