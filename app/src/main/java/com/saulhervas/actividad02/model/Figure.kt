package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent


interface Figure {

    fun calculatedArea(): Double

    fun navigateToCalculatedAreaActivity(context: Context): Intent

}