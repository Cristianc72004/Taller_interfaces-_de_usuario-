package dev.practica.componentskit2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CloseFullscreen
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.twotone.Image
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun IconsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Iconos y Botones") },
                navigationIcon = { // Aquí añadimos el ícono de "volver"
                    androidx.compose.material3.
                    Icon(
                        imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                        contentDescription = "Volver",
                        modifier = Modifier.clickable { navController.popBackStack() }
                    )
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {
            // Íconos con mensajes
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Face'") }
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Face",
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Edit Filled'") }
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = "Edit Filled",
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Edit Outlined'") }
            ) {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit Outlined",
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Bathtub'") }
            ) {
                Icon(
                    imageVector = Icons.Default.Bathtub,
                    contentDescription = "Bathtub",
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Image Two-Tone'") }
            ) {
                Icon(
                    imageVector = Icons.TwoTone.Image,
                    contentDescription = "Image Two-Tone",
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("Este es el icono 'Check'") }
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Check",
                    modifier = Modifier.size(90.dp)
                )
            }

            // Botones con mensajes
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("soy un icon button con Check Verde") }
            ) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Check Circle",
                    tint = Color.Green,
                    modifier = Modifier.size(90.dp)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp)
                    .size(90.dp),
                onClick = { println("soy un icon button con Close Rojo") }
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color.Red,
                    modifier = Modifier.size(90.dp)
                )
            }
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                modifier = Modifier
                    .padding(16.dp)
                    .width(300.dp),
                onClick = { println("soy un elevated button") }
            ) {
                Text(text = "Elevated Button")
            }
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Magenta
                ),
                modifier = Modifier.padding(16.dp),
                onClick = { println("soy un outlined button") }
            ) {
                Text(text = "Soy un outlined button")
            }
            FilledIconButton(
                onClick = { println("soy un filled icon button") },
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.CloseFullscreen,
                    contentDescription = "Close",
                    tint = Color.White
                )
            }
            ElevatedButton(
                enabled = false,
                modifier = Modifier.padding(16.dp),
                onClick = { /* Nada, está deshabilitado */ }
            ) {
                Text(text = "Soy un botón deshabilitado")
            }
        }
    }
}
