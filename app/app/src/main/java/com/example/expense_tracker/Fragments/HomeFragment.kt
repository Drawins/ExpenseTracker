package com.example.expense_tracker.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_tracker.DataBase.Expense
import com.example.expense_tracker.DataBase.ExpenseViewModel
import com.example.expense_tracker.ExpenseAdapter
import com.example.expense_tracker.R
import com.example.expense_tracker.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    lateinit var expenseAdapter: ExpenseAdapter
    lateinit var expenseRecyclerView: RecyclerView
    lateinit var expenseViewModel: ExpenseViewModel
    lateinit var addFloatingActionButton: FloatingActionButton
    lateinit var expenseTextView: TextView

    private var expenses: List<Expense> = emptyList()
    private var sumExpense: Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentHomeBinding.inflate(inflater,container,false)

        expenseAdapter = ExpenseAdapter()
        expenseRecyclerView = binding.expenseRecyclerView
        expenseTextView = binding.expenseTextView
        addFloatingActionButton = binding.addButton

        setUpExpenseRecyclerView()
        setUpExpenseViewModel()

        addFloatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addExpenseFragment)
        }
        return binding.root
    }
    @SuppressLint("SetTextI18n")
    private fun setUpExpenseViewModel() {
        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]
        expenseViewModel.readAllExpense.observe(viewLifecycleOwner){
            expense ->
            this.expenses = expense
            expenseAdapter.setData(expense)
            sumExpense = expense.sumOf { it.amount?.toDoubleOrNull()?:0.0 }
            expenseTextView.text = "$${sumExpense}"
        }
    }
    private fun setUpExpenseRecyclerView(){
        expenseRecyclerView.adapter = expenseAdapter
        expenseRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}