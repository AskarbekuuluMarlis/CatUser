package com.example.catuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.catuser.databinding.FragmentEntranceBinding

class Entrance_Fragment : Fragment() {

    lateinit var binding: FragmentEntranceBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentEntranceBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEntrance.setOnClickListener{
            findNavController().navigate(R.id.createChatFragment)
        }
        binding.btnBackFromEntrance.setOnClickListener{
            findNavController().navigate(R.id.registration_Fragment)
        }
    }


}