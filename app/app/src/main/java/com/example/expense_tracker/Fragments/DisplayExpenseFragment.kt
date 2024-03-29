package com.example.expense_tracker.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_tracker.DataBase.Expense
import com.example.expense_tracker.DataBase.ExpenseViewModel
import com.example.expense_tracker.ExpenseAdapter
import com.example.expense_tracker.R
import com.example.expense_tracker.databinding.FragmentDisplayExpenseBinding

class DisplayExpenseFragment : Fragment() {
    private lateinit var binding: FragmentDisplayExpenseBinding
    lateinit var expenseAdapter: ExpenseAdapter
    lateinit var expenseRecyclerView: RecyclerView
    lateinit var radioGroup: RadioGroup
    lateinit var expenseViewModel: ExpenseViewModel

    private  var expense = emptyList<Expense>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDisplayExpenseBinding.inflate(inflater,container,false)
        expenseAdapter = ExpenseAdapter()
        expenseRecyclerView = binding.expenseRecyclerView
        expenseRecyclerView.adapter = expenseAdapter
        expenseRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]
        setUpExpenseViewModel()
        sortExpense()
        return binding.root
    }
    private fun setUpExpenseViewModel() {
        expenseViewModel.readAllExpense.observe(viewLifecycleOwner) { expense ->
            this.expense = expense
            expenseAdapter.setData(expense)
        }
    }
      private  fun sortExpense() {
            radioGroup = binding.radioGroup
            radioGroup.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.radio_button_date -> {
                        expenseViewModel.readAllExpenseByDate.observe(viewLifecycleOwner){
                                expense ->
                            expenseAdapter.setData(expense)
                        }
                    }
                    R.id.radio_button_time -> {
                        expenseViewModel.readAllExpenseByTime.observe(viewLifecycleOwner){
                                expense ->
                            expenseAdapter.setData(expense)
                        }
                    }
                    R.id.radio_button_amount ->{
                        expenseViewModel.readAllExpenseByAmount.observe(viewLifecycleOwner){
                                expense->
                            expenseAdapter.setData(expense)
                        }
                    }
                }
            }
    }

}