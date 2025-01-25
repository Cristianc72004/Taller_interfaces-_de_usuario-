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
import androidx.compose.material.icons.filled.Check
import androidx.navigation.NavHostController
import dev.practica.componentkits.components.ItemContact


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold (
        topBar= {
            TopAppBar(title = { Text(text = "Home") })
        })
    {

            paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){
            ItemContact(
                "Iconos", Icons.Default.Edit,
                Modifier.clickable {
                    navController.navigate("icon" )


                })
            ItemContact(
                name = "TextField Screen", Icons.Default.Edit,
                Modifier.clickable {
                    navController.navigate("text")
                }
            )
            ItemContact(
                name = "CheckBox Screen", Icons.Default.Check,
                Modifier.clickable {
                    navController.navigate("checkbox")
                }
            )



        }
    }
}
