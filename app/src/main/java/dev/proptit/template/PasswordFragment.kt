package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dev.proptit.template.databinding.FragmentPasswordBinding
import dev.proptit.template.databinding.FragmentUserBinding

class PasswordFragment : Fragment() {
    private lateinit var binding: FragmentPasswordBinding
    private val viewModel: ViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPasswordBinding.inflate(layoutInflater,container,false)
        viewModel.username.observe(viewLifecycleOwner){
            binding.txtHello.text = "Hello $it"
        }
        binding.btnBackBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_passwordFragment_to_userFragment)
        }
        return binding.root
    }

}