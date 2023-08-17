package dev.proptit.template.ui.username

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import dev.proptit.template.R
import dev.proptit.template.LoginViewModel
import dev.proptit.template.databinding.FragmentUsernameBinding

class UsernameFragment : Fragment() {
    private var _binding: FragmentUsernameBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsernameBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            continueBtn.setOnClickListener {
                viewModel.setUsername(usernameEditText.text.toString())
                findNavController().navigate(R.id.passwordFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}