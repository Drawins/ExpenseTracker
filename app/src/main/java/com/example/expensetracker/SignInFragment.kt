package com.example.expensetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.expensetracker.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSignInBinding
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var submitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentSignInBinding.inflate(inflater,container,false)
        emailEditText = binding.editTextTextEmailAddress
        passwordEditText = binding.editTextTextPassword
        submitButton = binding.buttonSignIn

        return binding.root
    }
}