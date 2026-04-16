package com.example.myapplication

import android.content.Context
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Database(entities = [DepositEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao(): DepositDao
    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase = INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "db").build()
            INSTANCE = instance
            instance
        }
    }
}