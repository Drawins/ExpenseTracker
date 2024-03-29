package com.example.expense_tracker.Fragments

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.expense_tracker.DataBase.Expense
import com.example.expense_tracker.DataBase.ExpenseViewModel
import com.example.expense_tracker.LocalNotification.ExpenseNotificationService
import com.example.expense_tracker.R
import com.example.expense_tracker.databinding.FragmentAddExpenseBinding
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date


class AddExpenseFragment : Fragment() {
    private lateinit var binding: FragmentAddExpenseBinding
    lateinit var expenseViewModel: ExpenseViewModel
    lateinit var titleEditText: EditText
    lateinit var amountEditText: EditText
    lateinit var addButton: Button
    private lateinit var service: ExpenseNotificationService

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddExpenseBinding.inflate(inflater, container, false)

        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]
        titleEditText = binding.titleEditText
        amountEditText = binding.amountEditText
        addButton = binding.addExpenseButton

        service = ExpenseNotificationService(requireContext())

        insertExpense()
        return binding.root
    }

    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun insertExpense() {
        addButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val amount = amountEditText.text.toString()

            val currentDate = Date()
            val formatterDate = SimpleDateFormat("dd/MM/yy")
            val formattedDate = formatterDate.format(currentDate)

            val currentTime = LocalTime.now()
            val formatterTime = DateTimeFormatter.ofPattern("hh:mm a")
            val formattedTime = currentTime.format(formatterTime)

            if (title.isNotEmpty() && amount.isNotEmpty()) {
                service.showNotification(amount,title)
                val expense = Expense(0, title, amount, formattedDate, formattedTime)
                expenseViewModel.addExpense(expense)
                titleEditText.text.clear()
                amountEditText.text.clear()
            }
            findNavController().navigate(R.id.action_addExpenseFragment_to_homeFragment)
        }
    }
}