package com.example.myapplication
import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class ResultViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).dao()

    fun calculate(p: Double, m: Int, r: Double, add: Double): DepositEntity {
        val monthlyRate = r / 100 / 12
        var total = p
        repeat(m) {
            total = (total + add) * (1 + monthlyRate)
        }
        return DepositEntity(
            amount = p, months = m, rate = r,
            monthlyAdd = add, total = total, interest = total - p - (add * m)
        )
    }

    fun save(deposit: DepositEntity) = viewModelScope.launch {
        dao.insert(deposit)
    }
}