package com.example.expensetracker.RoomDataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Expense::class],
    version = 2
)
abstract class ExpenseDataBase: RoomDatabase() {

    abstract fun ExpenseDao():ExpenseDao

    companion object{
        @Volatile
        private var INSTNACE: ExpenseDataBase? = null
        fun getDataBase(context: Context): ExpenseDataBase {
            val temInstance = INSTNACE
            if (temInstance != null){
                return  temInstance
            }
            synchronized(this ){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExpenseDataBase::class.java,
                    "expense_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTNACE = instance
                return  instance
            }
        }
    }
}