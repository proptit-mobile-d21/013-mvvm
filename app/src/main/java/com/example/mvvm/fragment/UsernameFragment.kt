package com.example.mvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvm.R
import com.example.mvvm.databinding.FragmentUsernameBinding
import com.example.mvvm.viewmodel.MyViewModel

class UsernameFragment : Fragment() {
    private lateinit var binding: FragmentUsernameBinding
    private val myViewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsernameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            myViewModel.setUsername(binding.edtUsername.text.toString().trim())
            findNavController().navigate(R.id.action_usernameFragment_to_passwordFragment)
        }
    }
}