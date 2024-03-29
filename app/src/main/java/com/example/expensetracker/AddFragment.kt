package com.example.expensetracker

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
import com.example.expensetracker.LocalNotification.ExpenseNotificationService
import com.example.expensetracker.RoomDataBase.Expense
import com.example.expensetracker.ViewModel.ExpenseViewModel
import com.example.expensetracker.databinding.FragmentAddBinding
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date

class AddFragment : Fragment() {
    private lateinit var binding: FragmentAddBinding
    private lateinit var expenseViewModel: ExpenseViewModel
    private lateinit var titleEditText: EditText
    private lateinit var amountEditText: EditText
    private lateinit var service: ExpenseNotificationService

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(inflater, container, false)
        expenseViewModel = ViewModelProvider(this)[ExpenseViewModel::class.java]


        titleEditText = binding.titleEditText
        amountEditText = binding.amountEditText

        // Initialize service lazily
        service = ExpenseNotificationService(requireContext())

        val addExpenseButton: Button = binding.addExpenseButton
        addExpenseButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val amount = amountEditText.text.toString()

            val currentDate = Date()
            val formatterDate = SimpleDateFormat("dd/MM/yy")
            val formattedDate = formatterDate.format(currentDate)

            val currentTime = LocalTime.now()
            val formatterTime = DateTimeFormatter.ofPattern("hh:mm a")
            val formattedTime = currentTime.format(formatterTime)

            if (title.isNotEmpty() && amount.isNotEmpty()) {
                val expense = Expense(0, title, amount, formattedDate, formattedTime)
                expenseViewModel.addExpense(expense)
                titleEditText.text.clear()
                amountEditText.text.clear()
            }
            service.showNotification()

            findNavController().navigate(R.id.action_addFragment_to_displayFragment)
        }

        return binding.root
    }
}
