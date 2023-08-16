package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import dev.proptit.template.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private lateinit var binding : FragmentPasswordBinding
    private val sharedViewModel : InfomationViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPasswordBinding.inflate(layoutInflater,container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.password.observe(viewLifecycleOwner){newPassword ->
            binding.passwordEditText.setText(newPassword)
        }

        binding.helloTextView.text = getString(R.string.hello, sharedViewModel.username.value)

        binding.loginButton.setOnClickListener{
            findNavController().navigate(R.id.action_passwordFragment_to_usernameFragment)
        }
    }


}