package com.udacity.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//         Below two lines are part of Step 10, creating a class that extends viewmodel
        Log.i("MainActivity", "Called ViewModelProvider()[]!")
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
    }
}
