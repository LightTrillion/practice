package com.example.myapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DepositDao {
    @Insert suspend fun insert(deposit: DepositEntity)
    @Query("SELECT * FROM deposits ORDER BY date DESC")
    fun getAll(): Flow<List<DepositEntity>>
}