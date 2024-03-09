package com.example.aviatickets.model.service

import com.example.aviatickets.model.entity.Offer
import retrofit2.http.GET

interface TicketsApiService {
    @GET("https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list")
    suspend fun getOffers(): List<Offer>
}