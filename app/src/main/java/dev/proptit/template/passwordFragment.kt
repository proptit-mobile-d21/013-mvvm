package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import dev.proptit.template.databinding.FragmentPasswordBinding

class passwordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding?=null
    private val binding get() = _binding!!

    private val viewModel:MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentPasswordBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.username.observe(viewLifecycleOwner){
            binding.helloTxt.text = getString(R.string.hello_username, it)
        }

        binding.loginBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Login as ${viewModel.username.value}", Toast.LENGTH_SHORT)
                .show()
        }
    }

}