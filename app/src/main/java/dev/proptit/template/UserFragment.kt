package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import dev.proptit.template.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private lateinit var binding: FragmentUserBinding
    private val viewModel: ViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(layoutInflater,container,false)
        binding.btnButton.setOnClickListener{
            viewModel.setUsername(binding.edtUsername.text.toString())
            findNavController().navigate(R.id.action_userFragment_to_passwordFragment)
        }
        return binding.root
    }

}