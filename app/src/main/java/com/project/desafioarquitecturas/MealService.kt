package com.project.desafioarquitecturas

import retrofit2.http.GET
import retrofit2.http.Query

interface MealService {
    //@GET("filter.php?i={ingredient}")
    //suspend fun getMeal(@Path("ingredient") ingredient:String): Response<MealResponse>

    @GET("filter.php")
    suspend fun getMeal(@Query("i") ingredient:String): List<MealResponse>
}