package com.udacity.shoestore

import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoelistBinding

//import com.udacity.shoestore.databinding.ActivityMainBinding

/**
 * A simple [Fragment] subclass.
 */
class ShoelistFragment : Fragment() {

//    private var _binding: ActivityMainBinding? = null
//    private val binding get() = _binding

    private val sharedViewModel: ShoelistViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoelistBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoelist, container, false
        )
        binding.floatingActionButton.setOnClickListener{ v ->
            v.findNavController()
                .navigate(ShoelistFragmentDirections.actionShoelistFragmentToDetailFragment())
        }
        // Below two lines are part of Step 10, creating a class that extends viewmodel
//        Log.i("ShoelistFragment", "Called ViewModelProvider()[]!")
//        sharedViewModel = ViewModelProvider(this)[ShoelistViewModel::class.java]
//        sharedViewModel.shoeList.observe(viewLifecycleOwner, { newList ->
//            binding.textView5.setText(newList)
//        } )
        return binding.root
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_shoelist, container, false)
    }

}