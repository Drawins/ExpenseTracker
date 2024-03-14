package com.example.expensetracker.RoomDataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface IncomeDao {

    @Query("SELECT * FROM Income")
    fun getAllIncomes(): LiveData<List<Income>>

    @Insert
    suspend fun insertIncome(income: Income)

    @Update
    suspend fun updateIncome(income: Income)

    @Query("DELETE FROM Income")
    suspend fun deleteIncome()

    @Query("SELECT SUM(amount) FROM Income")
    fun getSumOfIncome(): LiveData<Double>
}