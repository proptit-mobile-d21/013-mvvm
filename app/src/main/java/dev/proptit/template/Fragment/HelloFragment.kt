package dev.proptit.template.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import dev.proptit.template.R
import dev.proptit.template.ViewModel.UserViewModel
import dev.proptit.template.databinding.FragmentHelloBinding


class HelloFragment : Fragment() {
    private lateinit var binding : FragmentHelloBinding
    private val viewModel : UserViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHelloBinding.inflate(inflater,container,false)
        viewModel.username.observe(viewLifecycleOwner) {
            binding.tvHello.text = "Hello $it"
        }
        return binding.root
    }


}