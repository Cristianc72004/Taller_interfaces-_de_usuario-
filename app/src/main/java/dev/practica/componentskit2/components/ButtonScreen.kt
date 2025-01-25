package dev.practica.componentskit2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import dev.practica.componentkits.components.ItemContact


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonScreen(navController: NavHostController) {
    Scaffold (
        topBar= {
            TopAppBar(title = { Text(text = "Home") })
        })
    {

            paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){
            ItemContact(
                "Buttons", Icons.Default.Edit,
                Modifier.clickable {
                    navController.navigate("Icons" )


                })

            ItemContact(
                "Check Box", Icons.Default.Edit,
                Modifier.clickable {
                    navController.navigate("text" )


                })
        }
    }
}