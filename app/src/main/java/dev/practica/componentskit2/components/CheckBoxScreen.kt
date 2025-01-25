package dev.practica.componentskit2.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "CheckBox Screen") },
                navigationIcon = { // Aquí añadimos el ícono de "volver"
                    androidx.compose.material3.Icon(
                        imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                        contentDescription = "Volver",
                        modifier = Modifier.clickable { navController.popBackStack() }
                    )
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            // Declarar la variable de estado para ambos CheckBoxes
            var checkedValue1 by remember { mutableStateOf(false) }
            var checkedValue2 by remember { mutableStateOf(false) }

            // Primera fila
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { checkedValue1 = !checkedValue1 } // Hacer toda la fila clickable
            ) {
                Checkbox(
                    checked = checkedValue1,
                    onCheckedChange = { /* No actualizar aquí */ }
                )
                Text(
                    text = "Opción 1",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            // Divisor horizontal
            HorizontalDivider()

            // Segunda fila
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { checkedValue2 = !checkedValue2 } // Hacer toda la fila clickable
            ) {
                Checkbox(
                    checked = checkedValue2,
                    onCheckedChange = { /* No actualizar aquí */ }
                )
                Text(
                    text = "Opción 2",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

