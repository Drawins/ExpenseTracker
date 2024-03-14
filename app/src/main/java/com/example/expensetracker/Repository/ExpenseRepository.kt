package com.example.expensetracker.Repository

import androidx.lifecycle.LiveData
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.RoomDataBase.ExpenseDao


class ExpenseRepository(private val expenseDao: ExpenseDao) {
    val readAllExpense: LiveData<List<Expense>> = expenseDao.getExpense()
    val readAllExpenseByDate: LiveData<List<Expense>> = expenseDao.getExpenseByDate()
    val readAllExpenseByTime: LiveData<List<Expense>> = expenseDao.getExpenseByTime()
    val readAllExpenseByAmount: LiveData<List<Expense>> = expenseDao.getExpenseBYAmount()

    suspend fun insertExpense(expense: Expense){
        expenseDao.insert(expense)
    }
    suspend fun deleteExpense(){
        expenseDao.delete()
    }
}