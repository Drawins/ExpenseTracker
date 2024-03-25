package com.example.expensetracker.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.Repository.IncomeRepository
import com.example.expensetracker.RoomDataBase.Income
import com.example.expensetracker.RoomDataBase.IncomeDataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class IncomeViewModel(application: Application) : AndroidViewModel(application) {

    private val incomeRepository: IncomeRepository
    val readAllIncome: LiveData<List<Income>>
    val sumOfIncome: LiveData<Double>

    init {
        val incomeDao = IncomeDataBase.getDatabase(application).incomeDao()
        incomeRepository = IncomeRepository(incomeDao)
        readAllIncome = incomeRepository.readAllIncome
        sumOfIncome = incomeRepository.sumOfAllIncome
    }

    fun addIncome(income: Income) {
        viewModelScope.launch(Dispatchers.IO) {
            incomeRepository.insertIncome(income)
        }
    }
    fun deleteIncome(){
        viewModelScope.launch {
            incomeRepository.deleteIncome()
        }
    }
    fun updateIncome(income: Income){
        viewModelScope.launch {
            incomeRepository.updateIncome(income)
        }
    }
}