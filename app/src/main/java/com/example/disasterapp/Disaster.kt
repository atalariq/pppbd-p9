package com.example.disasterapp

import androidx.annotation.DrawableRes

data class Disaster (
    val name: String="",
    val type: String="",
    @DrawableRes val image: Int = 0
)
