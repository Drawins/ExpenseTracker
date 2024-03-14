package com.example.expensetracker.RoomDataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Income::class], version = 2)

abstract class IncomeDataBase : RoomDatabase() {

    abstract fun incomeDao(): IncomeDao

    companion object {
        @Volatile
        private var INSTANCE: IncomeDataBase? = null

        fun getDatabase(context: Context): IncomeDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IncomeDataBase::class.java,
                    "income_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
