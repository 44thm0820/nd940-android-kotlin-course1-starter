package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoelistViewModel : ViewModel() {

    private lateinit var shoeList: MutableLiveData<MutableList<Shoe>>

    init {
        Log.i("ShoelistViewModel", "ShoelistViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ShoelistViewModel", "ShoelistViewModel destroyed!")
    }
}