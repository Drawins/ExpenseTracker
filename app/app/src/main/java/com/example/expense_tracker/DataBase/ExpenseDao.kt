package com.example.expense_tracker.DataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExpenseDao {

    @Insert
    suspend fun insert(expense: Expense)

    @Query("DELETE FROM Expense")
    suspend fun delete()

    @Query("SELECT * FROM Expense")
    fun getExpense(): LiveData<List<Expense>>

    @Query("SELECT * FROM Expense ORDER BY date DESC")
    fun getExpenseByDate(): LiveData<List<Expense>>

    @Query("SELECT * FROM Expense ORDER BY title ASC")
    fun getExpenseByTime(): LiveData<List<Expense>>

    @Query("SELECT * FROM Expense ORDER BY amount DESC")
    fun getExpenseBYAmount(): LiveData<List<Expense>>
}