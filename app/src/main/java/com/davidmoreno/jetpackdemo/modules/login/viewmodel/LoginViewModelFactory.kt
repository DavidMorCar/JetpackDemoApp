package com.davidmoreno.jetpackdemo.modules.login.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.davidmoreno.jetpackdemo.repositories.login.LoginCheckRepository

class LoginViewModelFactory (private val repository: LoginCheckRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(repository) as T
    }
}