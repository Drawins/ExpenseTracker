package com.example.expensetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.databinding.FragmentSignUpBinding
import com.google.firebase.auth.FirebaseAuth


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentSignUpBinding.inflate(inflater,container,false)

        firebaseAuth = FirebaseAuth.getInstance()

        signUpUser()

        binding.textView11.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }

        return binding.root
    }
    private fun signUpUser(){
        binding.button2.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()
            val confirmPassword = binding.editTextTextPassword2.text.toString()
            if (email.isNotBlank() && password.isNotBlank()&&confirmPassword.isNotBlank()){
                if (password == confirmPassword){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                        if (it.isSuccessful){
                            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
                        }else{
                            Toast.makeText(requireContext(), it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(requireContext(), "Password Mismatch", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(requireContext(),"Please fill in the required filed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}