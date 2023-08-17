package dev.proptit.template.ui.password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dev.proptit.template.R
import dev.proptit.template.LoginViewModel
import dev.proptit.template.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {
    private var _binding: FragmentPasswordBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel.username.observe(viewLifecycleOwner) {
                welcome.text = getString(R.string.welcome_back, it)
            }
            signInBtn.setOnClickListener {
                Toast.makeText(requireContext(), "Sign In", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}