package com.example.testapplication.model

import retrofit2.Call
import retrofit2.http.GET


interface ExhibitLoader{

    @GET("list")
    fun getExhibitList(): Call<List<Exhibit>>


}