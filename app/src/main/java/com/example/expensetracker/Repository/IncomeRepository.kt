package com.example.expensetracker.Repository

import androidx.lifecycle.LiveData
import com.example.expensetracker.RoomDataBase.Income
import com.example.expensetracker.RoomDataBase.IncomeDao


class IncomeRepository(private val incomeDao: IncomeDao) {

    val readAllIncome: LiveData<List<Income>> = incomeDao.getAllIncomes()
    val sumOfAllIncome: LiveData<Double> = incomeDao.getSumOfIncome()

    suspend fun insertIncome(income: Income){
        incomeDao.insertIncome(income)
    }
    suspend fun deleteIncome(){
        incomeDao.deleteIncome()
    }
    suspend fun updateIncome(income: Income){
        incomeDao.updateIncome(income)
    }
    suspend fun getSumOfIncome(){
        incomeDao.getSumOfIncome()
    }
}