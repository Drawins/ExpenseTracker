package com.example.expensetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.ViewModel.ExpenseViewModel
import com.example.expensetracker.databinding.ExpenseItemBinding
import com.example.expensetracker.databinding.FragmentExpenseBinding

class ExpenseFragment : Fragment() {
    private lateinit var binding: FragmentExpenseBinding
    private lateinit var expenseRecyclerView: RecyclerView
    private lateinit var expenseAdapter: ExpenseAdapter
    private lateinit var expenseViewModel: ExpenseViewModel
    private  var expense = emptyList<Expense>()
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentExpenseBinding.inflate(inflater , container,false)


        expenseAdapter = ExpenseAdapter()
        expenseRecyclerView = binding.expenseRecyclerView
        expenseRecyclerView.adapter = expenseAdapter
        expenseRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]
        expenseViewModel.readAllExpense.observe(viewLifecycleOwner){
                expense -> this.expense
            expenseAdapter.setData(expense)
        }
        sortExpense()
        return binding.root
    }
    private fun sortExpense() {
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