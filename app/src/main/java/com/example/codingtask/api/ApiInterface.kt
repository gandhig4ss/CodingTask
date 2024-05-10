package com.example.codingtask.api

import com.example.codingtask.data.GetArticles
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("articles")
    suspend fun getArticlesapi(): Response<GetArticles>
}

