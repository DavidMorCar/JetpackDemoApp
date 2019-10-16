package com.davidmoreno.jetpackdemo.util.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.davidmoreno.jetpackdemo.modules.login.viewmodel.LoginViewModel


class ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.newInstance() is LoginViewModel)
            return LoginViewModel() as T
        return LoginViewModel() as T
    }
}




