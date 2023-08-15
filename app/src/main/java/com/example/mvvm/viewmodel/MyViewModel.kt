package com.example.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username : LiveData<String>
        get() = _username
    fun setUsername(name: String) {
        _username.value = name
    }
}