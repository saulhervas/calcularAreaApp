package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent
import com.saulhervas.actividad02.view.CalculatedAreaCircleActivity

data class Circle(val radio: Double) : Figure {

    override fun calculatedArea(): Double {
        return Math.PI * radio * radio
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        return Intent(context, CalculatedAreaCircleActivity::class.java)
    }

}
