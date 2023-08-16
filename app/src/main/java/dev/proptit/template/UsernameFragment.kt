package dev.proptit.template

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import dev.proptit.template.databinding.ActivityMainBinding.inflate
import dev.proptit.template.databinding.FragmentUsernameBinding

class UsernameFragment : Fragment() {

    private lateinit var binding: FragmentUsernameBinding
    private val sharedViewModel : InfomationViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUsernameBinding.inflate(layoutInflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.username.observe(viewLifecycleOwner){newUsername ->
            binding.usernameEditText.setText(newUsername)

        }
        binding.nextButton.setOnClickListener{
            sharedViewModel.setUsername(binding.usernameEditText.text.toString())
            findNavController().navigate(R.id.action_usernameFragment_to_passwordFragment)
        }
    }
    fun changeUsername(){

    }

}