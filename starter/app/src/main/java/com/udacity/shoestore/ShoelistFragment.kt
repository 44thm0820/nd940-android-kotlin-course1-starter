package com.udacity.shoestore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

/**
 * A simple [Fragment] subclass.
 */
class ShoelistFragment : Fragment() {

    private lateinit var viewModel: ShoelistViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Below two lines are part of Step 10, creating a class that extends viewmodel
        Log.i("ShoelistFragment", "Called ViewModelProvider()[]!")
        viewModel = ViewModelProvider(this)[ShoelistViewModel::class.java]

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoelist, container, false)
    }

}