package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent

data class Circle (val radio: Double) : Figura {

    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        TODO("Not yet implemented")
    }

}
