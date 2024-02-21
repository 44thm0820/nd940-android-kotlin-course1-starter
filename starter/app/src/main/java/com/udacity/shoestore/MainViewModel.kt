package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel: ViewModel() {

    private lateinit var shoeList: MutableLiveData<MutableList<Shoe>>
//    private val _shoeList = MutableLiveData<MutableList<Shoe>>()
//    val shoeList: LiveData<MutableList<Shoe>> = _shoeList

    init {
        Log.i("MainViewModel", "MainViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MainViewModel", "MainViewModel destroyed!")
    }

    fun changeList(changedList: MutableList<Shoe>) {
        shoeList.value = changedList
    }

}