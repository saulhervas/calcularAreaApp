package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent
import com.saulhervas.actividad02.view.CalculatedAreaAcyivity

data class Circle (val radio: Double) : Figura {

    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        return Intent(context, CalculatedAreaAcyivity::class.java)
    }

}
