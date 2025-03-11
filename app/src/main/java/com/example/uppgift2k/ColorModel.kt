package com.example.uppgift2k


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ColorModel : ViewModel()

{
    private val _mathtotal = MutableStateFlow(0)
    val mathtotal: StateFlow<Int> = _mathtotal.asStateFlow()

    fun add(number: Int) {
        _mathtotal.value += number
    }
    enum class ColorType {
        RED, GREEN
    }
}