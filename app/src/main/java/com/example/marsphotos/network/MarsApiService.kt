package com.example.marsphotos.network

import com.example.marsphotos.network.model.Results
import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request


class MarsApiService {

    object MarsApi {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://api.themoviedb.org/3/movie/changes?page=1")
            .get()
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1NzkxMWQ5MWRlMmFmNzAyZTE4YzIxZjUzMzkwYTBkMyIsInN1YiI6IjY1YjhmZDk4NDZlNzVmMDE4M2JiOTdjNiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.BFh1BStbfzb5GOlppgyU7D7v8hZvl13-OXPlekUUHm4")
            .build()

        val response = client.newCall(request).execute()
    }
    interface MarsApiService {
        @GET("photos")
        suspend fun getPhotos(): List<MarsPhoto>

        @GET("movies")
        suspend fun getMovies(): List<Results>
    }



}



