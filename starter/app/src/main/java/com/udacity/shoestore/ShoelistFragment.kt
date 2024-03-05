package com.udacity.shoestore

import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
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
        binding.floatingActionButton.setOnClickListener { v ->
            v.findNavController()
                .navigate(ShoelistFragmentDirections.actionShoelistFragmentToDetailFragment())
        }
        // Below two lines are part of Step 10, creating a class that extends viewmodel
//        Log.i("ShoelistFragment", "Called ViewModelProvider()[]!")
//        sharedViewModel = ViewModelProvider(this)[ShoelistViewModel::class.java]
//        sharedViewModel.shoeList.observe(viewLifecycleOwner, { newList ->
//            binding.textView5.setText(newList)
//        } )
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.logout_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {
                    R.id.loginFragment -> {
                        findNavController().popBackStack(R.id.loginFragment, false)
                        true
                    }

                    else -> false
                }
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
        return binding.root
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_shoelist, container, false)
    }

}