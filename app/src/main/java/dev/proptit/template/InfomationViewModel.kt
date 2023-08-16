package dev.proptit.template

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfomationViewModel : ViewModel() {
    private var _username = MutableLiveData<String>()
    private var _password = MutableLiveData<String>()

    val username : LiveData<String> = _username
    val password : LiveData<String> = _password

    fun setUsername(newUsername : String){
        _username.value = newUsername
    }

    fun setPassword(newPassword : String){
        _username.value = newPassword
    }
}