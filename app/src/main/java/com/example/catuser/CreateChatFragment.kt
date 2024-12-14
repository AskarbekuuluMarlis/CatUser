package com.example.catuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.catuser.databinding.FragmentCreateChatBinding

class CreateChatFragment : Fragment() {

    lateinit var binding: FragmentCreateChatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateChatBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBackFromCreateChat.setOnClickListener{
            findNavController().navigate(R.id.entrance_Fragment)
        }
    }

}