package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent
import com.saulhervas.actividad02.view.CalculatedAreaTriangleActivity

class Triangle(val base: Double, val altura: Double) : Figure {

    override fun calculatedArea(): Double {
        return (base * altura) / 2
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        return Intent(context, CalculatedAreaTriangleActivity::class.java)
    }

}