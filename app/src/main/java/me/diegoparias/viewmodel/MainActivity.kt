package me.diegoparias.viewmodel


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel



class ContadorViewModel : ViewModel() {
    var contador by mutableStateOf(0)
    fun sumar() { contador++ }
}



class MainActivity : ComponentActivity() {
    private val viewModel: ContadorViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Contador: ${viewModel.contador}")
                Button(onClick = { viewModel.sumar() }) { Text("Sumar") }
            }
        }
    }
}