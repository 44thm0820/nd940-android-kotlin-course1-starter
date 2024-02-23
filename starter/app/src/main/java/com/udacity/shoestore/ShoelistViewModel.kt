package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoelistViewModel : ViewModel() {

    private val _shoeList = MutableLiveData<MutableList<Shoe>>(mutableListOf())
    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList

    fun saveShoeList(newShoeList: MutableList<Shoe>) {
        _shoeList.value = newShoeList
    }

    init {
        Log.i("ShoelistViewModel", "ShoelistViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ShoelistViewModel", "ShoelistViewModel destroyed!")
    }
}