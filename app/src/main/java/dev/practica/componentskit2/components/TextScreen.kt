package dev.practica.componentskit2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.navigation.NavHostController

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun TextScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "TextField Screen") },
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
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            // Ejemplo 1: TextField básico
            var text by rememberSaveable { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { newValue -> text = newValue },
                modifier = Modifier.padding(16.dp)
            )

            // Ejemplo 2: OutlinedTextField con label
            var text2 by remember { mutableStateOf("") }
            TextField(
                value = text2,
                onValueChange = { newValue -> text2 = newValue },
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Enter your name") }
            )

            // Ejemplo 3: OutlinedTextField con singleLine y maxLines
            var text3 by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text3,
                onValueChange = { newValue -> text3 = newValue },
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Enter your name") },
                singleLine = true,
                maxLines = 1
            )

            // Ejemplo 4: OutlinedTextField para contraseña
            var text4 by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text4,
                onValueChange = { newValue -> text4 = newValue },
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Password") },
                singleLine = true,
                maxLines = 1,
                visualTransformation = PasswordVisualTransformation()
            )

            // Ejemplo 5: OutlinedTextField para contraseña con visualización/ocultación
            var text5 by remember { mutableStateOf("") }
            var showPassword by remember { mutableStateOf(false) }

            OutlinedTextField(
                value = text5,
                onValueChange = { newValue -> text5 = newValue },
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Password") },
                singleLine = true,
                maxLines = 1,
                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(onClick = { showPassword = !showPassword }) {
                        if (showPassword) {
                            Icon(
                                imageVector = Icons.Default.Visibility,
                                contentDescription = "Visibility of the password"
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.VisibilityOff,
                                contentDescription = "Visibility of the password"
                            )
                        }
                    }
                }
            )

            // Ejemplo 6: TextField con rememberSaveable
            var text7 by rememberSaveable { mutableStateOf("") }
            TextField(
                value = text7,
                onValueChange = { newValue -> text7 = newValue },
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
