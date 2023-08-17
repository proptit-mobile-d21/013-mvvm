package dev.proptit.template

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountViewModel: ViewModel() {
    private var _username = MutableLiveData<String>()
    val username: LiveData<String>
        get() = _username

    fun setUsername(name: String){
        _username.value = name
    }
}