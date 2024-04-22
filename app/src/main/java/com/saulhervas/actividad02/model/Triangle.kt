package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent

class Triangle (val base: Double, val altura: Double) : Figura {

    override fun calcularArea(): Double {
        return (base * altura) / 2
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        TODO("Not yet implemented")
    }

}