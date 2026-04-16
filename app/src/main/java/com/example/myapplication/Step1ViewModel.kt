package com.example.myapplication
import androidx.lifecycle.ViewModel

class Step1ViewModel : ViewModel() {
    fun validate(amount: String, months: String): Boolean =
        amount.isNotBlank() && months.isNotBlank() && months.toIntOrNull() ?: 0 > 0
}