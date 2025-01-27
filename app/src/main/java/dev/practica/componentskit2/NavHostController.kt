package dev.practica.componentskit2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.practica.componentskit2.components.ButtonScreen
import dev.practica.componentskit2.components.CheckBoxScreen
import dev.practica.componentskit2.components.HomeScreen
import dev.practica.componentskit2.components.IconsScreen
import dev.practica.componentskit2.components.TextScreen

@Composable
fun NavigatioHostController(){

    val navController= rememberNavController()
    NavHost(navController=navController, startDestination ="home")

    {
        composable(route = "home"){HomeScreen(navController)}

        composable(route = "icon"){ IconsScreen(navController) }

        composable("text") { TextScreen(navController) }

        composable(route = "checkbox") { CheckBoxScreen(navController)
        }
        composable(route = "Botones") { ButtonScreen(navController)
        }



    }
}