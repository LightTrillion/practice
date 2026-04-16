package com.example.myapplication

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.flow.Flow

class HistoryViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).dao()

    // Получаем данные из Room в виде LiveData
    val allDeposits: LiveData<List<DepositEntity>> = dao.getAll().asLiveData()
}