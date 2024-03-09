package com.example.aviatickets.model.network

import com.example.aviatickets.model.service.TicketsApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val aviaTicketsApi: TicketsApiService = retrofit.create(TicketsApiService::class.java)
}