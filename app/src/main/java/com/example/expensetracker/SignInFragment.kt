package com.example.expensetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.databinding.FragmentSignInBinding
import com.google.firebase.auth.FirebaseAuth

class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        firebaseAuth = FirebaseAuth.getInstance()

        signInUser()
        binding.textView11.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
        return binding.root
    }

    private fun signInUser() {
        binding.buttonSignIn.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            if (email.isNotBlank() && password.isNotBlank()) {
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        findNavController().navigate(R.id.action_signInFragment_to_displayFragment)
                    } else {
                        Toast.makeText(requireContext(), it.exception.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            } else {
                Toast.makeText(requireContext(), "Please fill in the required filed", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null){
            findNavController().navigate(R.id.action_signInFragment_to_displayFragment)
        }
    }
}
