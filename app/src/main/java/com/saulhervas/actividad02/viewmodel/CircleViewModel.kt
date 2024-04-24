package com.saulhervas.actividad02.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CircleViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun calculateArea(radius: Double) {
        val area = 3.1416 * radius * radius
        _result.value = area.toString()
    }
}