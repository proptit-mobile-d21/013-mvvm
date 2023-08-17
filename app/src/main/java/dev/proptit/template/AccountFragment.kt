package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import dev.proptit.template.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {
    private lateinit var binding: FragmentAccountBinding
    private val viewModel: AccountViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(inflater, container, false)
        setOnClickListener()


        return binding.root
    }

    private fun setOnClickListener() {
        binding.btnNext.setOnClickListener{
            viewModel.setUsername(binding.etUser.text.toString())
            findNavController().navigate(R.id.action_accountFragment_to_loginFragment)
        }
    }


}