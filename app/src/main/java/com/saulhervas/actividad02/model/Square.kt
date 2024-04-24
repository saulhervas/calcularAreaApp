package com.saulhervas.actividad02.model

import android.content.Context
import android.content.Intent
import com.saulhervas.actividad02.view.CalculatedAreaSquareActivity

data class Square(val side: Double) : Figure {

    override fun calculatedArea(): Double {
        return side * side
    }

    override fun navigateToCalculatedAreaActivity(context: Context): Intent {
        return Intent(context, CalculatedAreaSquareActivity::class.java)
    }

}