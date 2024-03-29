package com.example.expense_tracker.DataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val title:String,
    val amount:String,
    val date: String,
    val time:String
)
