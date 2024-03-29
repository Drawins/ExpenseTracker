package com.example.expense_tracker.DataBase

import androidx.lifecycle.LiveData

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