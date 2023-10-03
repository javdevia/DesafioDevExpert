package com.project.desafioarquitecturas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.project.desafioarquitecturas.ui.theme.DesafioArquitecturasTheme
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesafioArquitecturasTheme {

                LaunchedEffect(key1 = true) {
                    Retrofit.Builder()
                        .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                        .create(MealService::class.java)
                        .getMeal("Noodles")
                        .forEach { Log.d("JAVDEVIA", it.meals.mealName) }
                }


                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //LazyVerticalGrid(columns = GridCells.Adaptive(180.dp)) {
                    //    this.items(meals.value){ meal-> Text(text=meals.name)

                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesafioArquitecturasTheme {
        Greeting("Android")
    }
}