package com.saulhervas.actividad02.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SquareViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun calculateArea(side: Double) {
        val area = side * side
        _result.value = "$area  Cm"
    }
}