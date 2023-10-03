package com.project.desafioarquitecturas

import com.google.gson.annotations.SerializedName

data class MealResponse (
@SerializedName("meals") val meals: MealData

)

data class MealData(
    @SerializedName("strMeal") val mealName:String,
    @SerializedName("strMealThumb") val mealImg: String,
    @SerializedName("idMeal") val mealId:String
)