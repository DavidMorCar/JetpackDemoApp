package com.davidmoreno.jetpackdemo.services

import com.davidmoreno.jetpackdemo.util.BASE_URL
import retrofit2.CallAdapter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiService {

    fun GetApiService(callAdapterFactory: CallAdapter.Factory): ApiEndPoints {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(callAdapterFactory)
            .build()
            .create(ApiEndPoints::class.java)
    }


}
