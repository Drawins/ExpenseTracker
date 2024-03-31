package com.example.expensetracker

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var firebaseAuth: FirebaseAuth

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView2.text = "Welcome"
        signOutUser()

        return binding.root
    }

    private fun signOutUser() {
        binding.button.setOnClickListener {
            val dialog = AlertDialog.Builder(requireContext())
            dialog.apply {
                setTitle("Sign Out")
                setMessage("Are you sure you want to sign out?")
                setNegativeButton("No"){
                    negative,_ ->
                    negative.cancel()
                }
                setPositiveButton("Yes"){
                    positive,_ ->
                    firebaseAuth.signOut()
                    findNavController().navigate(R.id.action_profileFragment_to_signInFragment)
                    positive.dismiss()
                }
            }
            dialog.create()
            dialog.show()
        }
    }
}