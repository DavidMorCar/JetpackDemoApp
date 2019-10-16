package com.davidmoreno.jetpackdemo.repositories.login

import kotlinx.coroutines.delay

class LoginCheckRepository private constructor() {

    suspend fun checkUser(userId: String, userPassword: String): Boolean {
        delay(1000)
        if (userId == "user" && userPassword == "1234")
            return true
        return false
    }

    companion object {

        // For Singleton instantiation
        @Volatile
        private var instance: LoginCheckRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: LoginCheckRepository().also { instance = it }
            }
    }
}