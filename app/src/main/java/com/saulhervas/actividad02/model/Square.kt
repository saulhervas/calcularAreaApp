package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent
import com.saulhervas.actividad02.view.CalculatedAreaAcyivity

data class Square(val lado: Double) : Figura {

    override fun calcularArea(): Double {
        return lado * lado
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        return Intent(context, CalculatedAreaAcyivity::class.java)
    }

}