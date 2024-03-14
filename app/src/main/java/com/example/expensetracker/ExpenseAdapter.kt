package com.example.expensetracker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.databinding.ExpenseItemBinding

class ExpenseAdapter : RecyclerView.Adapter<ExpenseAdapter.ExpenseViewHolder>() {

    private var expenses: List<Expense> = emptyList()

    inner class ExpenseViewHolder(private val binding: ExpenseItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(expense: Expense) {
            binding.apply {
                titleTextView.text = expense.title
                amountTextView.text = "$${expense.amount}"
                dateTextView.text = expense.date
                timeTextView.text = expense.time
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ExpenseItemBinding.inflate(inflater, parent, false)
        return ExpenseViewHolder(binding)
    }

    override fun getItemCount(): Int = expenses.size

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        holder.bind(expenses[position])
    }

    fun setData(newExpenses: List<Expense>) {
        expenses = newExpenses
        notifyDataSetChanged()
    }
}