package com.davidmoreno.jetpackdemo.util

import android.content.Context
import com.davidmoreno.jetpackdemo.modules.login.viewmodel.LoginViewModelFactory
import com.davidmoreno.jetpackdemo.repositories.login.LoginCheckRepository

/**
 * Static methods used to inject classes needed for various Activities and Fragments.
 */
object InjectorUtils {

    private fun getLoginCheckRepository(context: Context): LoginCheckRepository {
        return LoginCheckRepository.getInstance()
    }

    fun provideLoginViewModelFactory(
        context: Context
    ): LoginViewModelFactory {
        val repository = getLoginCheckRepository(context)
        return LoginViewModelFactory(repository)
    }

}
