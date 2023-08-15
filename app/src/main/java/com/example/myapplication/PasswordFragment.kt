package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.myapplication.ViewModel.UserViewModel
import com.example.myapplication.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding? = null
    private val binding get() = _binding!!

    private val userViewModel : UserViewModel by activityViewModels()
    var textUpdate: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userViewModel.username.observe(viewLifecycleOwner) {
            textUpdate = userViewModel.username.value.toString()
        }

        binding.login.setOnClickListener{
            Toast.makeText(requireContext(), textUpdate , Toast.LENGTH_LONG).show()
        }
    }
}