package com.example.myapplicationnn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationnn.ui.theme.MyApplicationnnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationnnTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomNavigationBar() }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Bienvenido Usuario")
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    BottomAppBar(
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Button(onClick = { /* Acción para Inicio */ }, modifier = Modifier.weight(1f)) {
            Text("Inicio")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = { /* Acción para Mapa */ }, modifier = Modifier.weight(1f)) {
            Text("Mapa")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = { /* Acción para Mi Cuenta */ }, modifier = Modifier.weight(1f)) {
            Text("Mi Cuenta")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationnnTheme {
        Scaffold(bottomBar = { BottomNavigationBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Bienvenido Usuario")
            }
        }
    }
}



