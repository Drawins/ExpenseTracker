package com.example.expensetracker

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
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.RoomDataBase.Income
import com.example.expensetracker.ViewModel.ExpenseViewModel
import com.example.expensetracker.ViewModel.IncomeViewModel
import com.example.expensetracker.databinding.FragmentDisplayBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DisplayFragment : Fragment() {

    private lateinit var binding: FragmentDisplayBinding
    private lateinit var expenseAdapter: ExpenseAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var expenseViewModel: ExpenseViewModel
    private lateinit var incomeViewModel: IncomeViewModel
    private lateinit var addButton: FloatingActionButton
    private lateinit var balanceTextView: TextView
    private lateinit var expenseTextView: TextView
    private lateinit var incomeTextView: TextView
    private lateinit var moreExpense: TextView


    private var expenses: List<Expense> = emptyList()
    private var sumIncome: Double = 0.0
    private var sumExpense: Double = 0.0
    private lateinit var income: List<Income>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        incomeTextView = binding.incomeTextView
        balanceTextView = binding.textViewBalance
        expenseTextView = binding.expenseTextView
        moreExpense = binding.moreExpense


        expenseAdapter = ExpenseAdapter()
        recyclerView = binding.expenseRecyclerView
        recyclerView.adapter = expenseAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]
        incomeViewModel = ViewModelProvider(this)[IncomeViewModel::class.java]


        incomeTextView.setOnClickListener {
            val action = DisplayFragmentDirections.actionDisplayFragmentToAddIncomeFragment(
                sumIncome.toString()
            )
            findNavController().navigate(action)
        }


        incomeViewModel.readAllIncome.observe(viewLifecycleOwner) { income ->
            this.income = income
        }
        incomeViewModel.sumOfIncome.observe(viewLifecycleOwner) { sum ->
            sumIncome = sum
            incomeTextView.text = sumIncome.toString()
            updateBalance()
        }


        expenseViewModel.readAllExpense.observe(viewLifecycleOwner) { expenses ->
            this.expenses = expenses
            expenseAdapter.setData(expenses)

            sumExpense = expenses.sumOf { it.amount?.toDoubleOrNull() ?: 0.0 }
            expenseTextView.text = "$$sumExpense"
            updateBalance()
        }


        addButton = binding.addButton
        addButton.setOnClickListener {
            val action = DisplayFragmentDirections.actionDisplayFragmentToAddFragment()
            findNavController().navigate(action)
        }


        moreExpense.setOnClickListener {
            findNavController().navigate(R.id.action_displayFragment_to_expenseFragment)
        }
    }
    private   fun updateBalance() {
        val resultDouble = sumIncome - sumExpense
        balanceTextView.text = if (resultDouble.toInt() == 0) {
            "$0.0"
        } else {
            "$$resultDouble"
        }
    }
}