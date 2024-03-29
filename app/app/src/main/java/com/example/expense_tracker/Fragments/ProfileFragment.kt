package com.example.expense_tracker.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.expense_tracker.R
import com.example.expense_tracker.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth


class ProfileFragment : Fragment() {
   private lateinit var binding:FragmentProfileBinding
   private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.button.setOnClickListener {
            firebaseAuth.signOut()
           
        }
        return binding.root
    }
}