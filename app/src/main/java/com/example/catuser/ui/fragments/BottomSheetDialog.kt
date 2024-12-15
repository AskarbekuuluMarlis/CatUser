package com.example.catuser.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.catuser.R
import com.example.catuser.databinding.BottomDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetDialog : BottomSheetDialogFragment() {

   lateinit var binding: BottomDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BottomDialogBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnChangeLanguage.setOnClickListener{

        }

        binding.btnExit.setOnClickListener{
            findNavController().navigate(R.id.entrance_Fragment)
        }

        binding.btnSettings.setOnClickListener{
            findNavController().navigate(R.id.settingsFragment)
        }

        binding.btnChangeLight.setOnClickListener{
        }
    }

}