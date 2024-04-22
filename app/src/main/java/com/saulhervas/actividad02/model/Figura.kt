package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent


interface Figura {

    fun calcularArea(): Double

    fun navigateToCalculatedAreaActivity(context: Context): Intent

}