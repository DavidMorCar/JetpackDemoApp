package com.davidmoreno.jetpackdemo.repositories.login

class LoginCheckRepository private constructor() {

    suspend fun checkUser(userId: String, userPassword: String): Boolean {
        if(userId == "user" && userPassword == "1234")
            return true
        return false
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