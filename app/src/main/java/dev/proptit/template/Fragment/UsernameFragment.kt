package dev.proptit.template.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dev.proptit.template.R
import dev.proptit.template.ViewModel.UserViewModel
import dev.proptit.template.databinding.FragmentUsernameBinding

class UsernameFragment : Fragment() {
    private lateinit var binding : FragmentUsernameBinding
    private val viewModel : UserViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsernameBinding.inflate(inflater,container,false)
        binding.btnNext.setOnClickListener {
            viewModel.username.value = binding.etUsername.text.toString()
            findNavController().navigate(R.id.action_usernameFragment_to_helloFragment)
        }
        return binding.root

    }


}