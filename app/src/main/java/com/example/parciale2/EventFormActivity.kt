package com.example.parciale2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
class EventFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventForm { finish() }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventForm(onClose: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.add_event)) }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val name = remember { mutableStateOf("") }
            val description = remember { mutableStateOf("") }
            val location = remember { mutableStateOf("") }
            val price = remember { mutableStateOf("") }
            val date = remember { mutableStateOf("") }
            val capacity = remember { mutableStateOf("") }

            TextField(
                value = name.value,
                onValueChange = { name.value = it },
                label = { Text(stringResource(id = R.string.event_name)) }
            )
            TextField(
                value = description.value,
                onValueChange = { description.value = it },
                label = { Text(stringResource(id = R.string.event_description)) }
            )
            TextField(
                value = location.value,
                onValueChange = { location.value = it },
                label = { Text(stringResource(id = R.string.event_location)) }
            )
            TextField(
                value = price.value,
                onValueChange = { price.value = it },
                label = { Text(stringResource(id = R.string.event_price)) }
            )
            TextField(
                value = date.value,
                onValueChange = { date.value = it },
                label = { Text(stringResource(id = R.string.event_date)) }
            )
            TextField(
                value = capacity.value,
                onValueChange = { capacity.value = it },
                label = { Text(stringResource(id = R.string.event_capacity)) }
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = {
                    println("Datos del evento:")
                    println("Nombre: ${name.value}, Descripción: ${description.value}, Ubicación: ${location.value}")
                    println("Precio: ${price.value}, Fecha: ${date.value}, Aforo: ${capacity.value}")
                }) {
                    Text(stringResource(id = R.string.save))
                }
                Button(onClick = onClose) {
                    Text(stringResource(id = R.string.close))
                }
            }
        }
    }
}
