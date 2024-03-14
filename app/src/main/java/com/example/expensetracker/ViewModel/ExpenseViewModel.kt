package com.example.expensetracker.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.Repository.ExpenseRepository
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.RoomDataBase.ExpenseDataBase
import kotlinx.coroutines.launch

class ExpenseViewModel(application: Application): AndroidViewModel(application) {
    val readAllExpense: LiveData<List<Expense>>
    val readAllExpenseByDate: LiveData<List<Expense>>
    val readAllExpenseByTime: LiveData<List<Expense>>
    val readAllExpenseByAmount: LiveData<List<Expense>>


    private val expenseRepository: ExpenseRepository
    init {
        val expenseDao = ExpenseDataBase.getDataBase(application).ExpenseDao()
        expenseRepository = ExpenseRepository(expenseDao)
        readAllExpense = expenseRepository.readAllExpense
        readAllExpenseByDate = expenseRepository.readAllExpenseByDate
        readAllExpenseByTime = expenseRepository.readAllExpenseByTime
        readAllExpenseByAmount = expenseRepository.readAllExpenseByAmount
    }
    fun addExpense(expense: Expense){
        viewModelScope.launch {
            expenseRepository.insertExpense(expense)
        }
    }
    fun deleteExpense(){
        viewModelScope.launch {
            expenseRepository.deleteExpense()
        }
    }
}