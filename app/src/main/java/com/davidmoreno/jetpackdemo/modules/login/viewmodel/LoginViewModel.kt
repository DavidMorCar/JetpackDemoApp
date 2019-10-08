package com.davidmoreno.jetpackdemo.modules.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.davidmoreno.jetpackdemo.repositories.login.LoginCheckRepository

class LoginViewModel internal constructor(repository: LoginCheckRepository) : ViewModel() {

    val loginStatus = MutableLiveData<Boolean>()

}