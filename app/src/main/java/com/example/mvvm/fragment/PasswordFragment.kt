package com.example.mvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mvvm.databinding.FragmentPasswordBinding
import com.example.mvvm.viewmodel.MyViewModel


class PasswordFragment : Fragment() {

    private lateinit var binding: FragmentPasswordBinding
    private val myViewModel: MyViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myViewModel.username.observe(viewLifecycleOwner) {
            binding.tvHello.text = "Hello $it"
        }
        binding.btnLogin.setOnClickListener {
            Toast.makeText(requireContext(), "Login successful", Toast.LENGTH_SHORT)
                .show()
        }
    }
}