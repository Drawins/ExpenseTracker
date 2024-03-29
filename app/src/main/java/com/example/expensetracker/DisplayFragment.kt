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
import com.example.expensetracker.ViewModel.ExpenseViewModel
import com.example.expensetracker.databinding.FragmentDisplayBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DisplayFragment : Fragment() {

    private lateinit var binding: FragmentDisplayBinding
    private lateinit var expenseAdapter: ExpenseAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var expenseViewModel: ExpenseViewModel
    private lateinit var addButton: FloatingActionButton
    private lateinit var expenseTextView: TextView




    private var expenses: List<Expense> = emptyList()
    private var sumExpense: Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        expenseTextView = binding.expenseTextView


        expenseAdapter = ExpenseAdapter()
        recyclerView = binding.expenseRecyclerView
        recyclerView.adapter = expenseAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]

        expenseViewModel.readAllExpense.observe(viewLifecycleOwner) { expenses ->
            this.expenses = expenses
            expenseAdapter.setData(expenses)

            sumExpense = expenses.sumOf { it.amount?.toDoubleOrNull() ?: 0.0 }
            expenseTextView.text = "$$sumExpense"
        }


        addButton = binding.addButton
        addButton.setOnClickListener {
            val action = DisplayFragmentDirections.actionDisplayFragmentToAddFragment()
            findNavController().navigate(action)
        }

    }
}