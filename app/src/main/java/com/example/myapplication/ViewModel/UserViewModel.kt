package com.example.myapplication.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var username : MutableLiveData<String> = MutableLiveData()
}