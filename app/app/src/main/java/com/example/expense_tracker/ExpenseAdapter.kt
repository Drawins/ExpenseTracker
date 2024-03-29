package com.example.expense_tracker

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_tracker.DataBase.Expense
import com.example.expense_tracker.databinding.ExpenseItemBinding

class ExpenseAdapter:RecyclerView.Adapter<ExpenseAdapter.ExpenseViewHolder>(){

    private var expenses: List<Expense> = emptyList()

    class ExpenseViewHolder(private val binding: ExpenseItemBinding):RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(expense:Expense){
            binding.apply {
                titleTextView.text = expense.title
                amountTextView.text = "$${ expense.amount}"
                dateTextView.text = expense.date
                timeTextView.text = expense.time
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):ExpenseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ExpenseItemBinding.inflate(inflater,parent,false)
        return ExpenseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseAdapter.ExpenseViewHolder, position: Int) {
        holder.bind(expenses[position])
    }

    override fun getItemCount(): Int {
      return expenses.size
    }
    fun setData(newExpense:List<Expense>){
        this.expenses = newExpense
        notifyDataSetChanged()
    }
}