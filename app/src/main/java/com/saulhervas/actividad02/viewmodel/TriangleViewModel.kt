package com.saulhervas.actividad02.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TriangleViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun calculateArea(base: Double, height: Double) {
        val area = 0.5 * base * height
        _result.value = "$area  Cm"
    }
}