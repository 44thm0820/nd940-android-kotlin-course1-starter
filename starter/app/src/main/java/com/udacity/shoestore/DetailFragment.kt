package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentDetailBinding


/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false)

        binding.btnClearForm.setOnClickListener { v: View ->
            binding.editName.setText(null)
            binding.editSize.setText(null)
            binding.editCompany.setText(null)
            binding.editDescription.setText(null)
        }
//        binding.btnSubmitForm.setOnClickListener { v: View ->
            // to complete
//        }
        return binding.root
    }

}