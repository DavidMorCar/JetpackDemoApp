package com.davidmoreno.jetpackdemo.modules.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.davidmoreno.jetpackdemo.repositories.login.LoginCheckRepository
import com.davidmoreno.jetpackdemo.util.base.BaseViewModel
import kotlinx.coroutines.launch

class LoginViewModel : BaseViewModel() {

    private val repository =  LoginCheckRepository.getInstance()

    init {
        viewModelScope.launch {
            // Coroutine that will be canceled when the ViewModel is cleared.
            // Use when viewModel init with a routine
        }
    }

    val loginStatus = MutableLiveData<Boolean>()

    fun checkUserLogin(userNsme: String, userOPassword:String){
        ioScope.launch {
            loginStatus.postValue(repository.checkUser(userNsme, userOPassword))
        }
    }

}