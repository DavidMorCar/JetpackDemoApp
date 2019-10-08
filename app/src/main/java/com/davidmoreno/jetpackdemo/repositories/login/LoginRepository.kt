package com.davidmoreno.jetpackdemo.repositories.login

class LoginCheckRepository private constructor() {

    suspend fun checkUser(userId: String, userPassword: String) {

    }

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: LoginCheckRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: LoginCheckRepository().also { instance = it }
            }
    }
}