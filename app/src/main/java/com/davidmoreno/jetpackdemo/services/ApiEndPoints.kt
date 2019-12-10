package com.davidmoreno.jetpackdemo.services

import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiEndPoints {

    interface LoginApi{
        @GET("/photos")
        fun getImages(): Observable<Response<Boolean>>

        @FormUrlEncoded
        @POST("")
        fun verifyLogin( @Field("userEmail") userEmail: String,
                         @Field("userPassword") userPassword: String
        ): Observable<Response<Boolean>>
    }

}