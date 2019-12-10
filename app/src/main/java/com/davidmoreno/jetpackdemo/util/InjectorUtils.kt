package com.davidmoreno.jetpackdemo.util

import com.davidmoreno.jetpackdemo.services.ApiEndPoints
import com.davidmoreno.jetpackdemo.services.ApiService
import com.davidmoreno.jetpackdemo.util.base.ViewModelFactory

/**
 * Static methods used to inject classes needed for various Activities and Fragments.
 */
object InjectorUtils {


    fun provideLoginViewModelFactory(): ViewModelFactory {
        return ViewModelFactory()
    }

    fun provideApiService(): ApiService{
        return ApiService()
    }

}
