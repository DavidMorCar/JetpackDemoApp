package com.davidmoreno.jetpackdemo.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userId")
    val userId: String?,

    @SerializedName("userEmail")
    val userEmail: String?,

    @SerializedName("userPassword")
    val userPassword: String?

)