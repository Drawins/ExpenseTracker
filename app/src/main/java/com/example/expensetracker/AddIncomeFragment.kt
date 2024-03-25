package com.example.expensetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.expensetracker.RoomDataBase.Income
import com.example.expensetracker.ViewModel.IncomeViewModel
import com.example.expensetracker.databinding.FragmentAddIncomeBinding

class AddIncomeFragment : Fragment() {
    private lateinit var binding: FragmentAddIncomeBinding
    private lateinit var  incomeEditText: EditText
    private lateinit var incomeAddButton: Button
    private lateinit var incomeViewModel: IncomeViewModel
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddIncomeBinding.inflate(inflater, container, false)
        incomeEditText = binding.addIncome
        incomeAddButton = binding.addIncomeButton
        incomeViewModel = ViewModelProvider(this)[IncomeViewModel::class.java]

        button = binding.button
        button.setOnClickListener {
            incomeViewModel.deleteIncome()
            findNavController().navigateUp()
        }

        incomeAddButton.setOnClickListener {
            val amount = incomeEditText.text.toString()
            if (amount.isNotEmpty()) {
                val currentIncome = Income(0, amount)
                incomeViewModel.addIncome(currentIncome)
                findNavController().navigateUp()
            }
        }
        return binding.root
    }
}