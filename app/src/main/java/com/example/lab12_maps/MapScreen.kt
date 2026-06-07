package com.example.lab12_maps

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType

@Composable
fun MapScreen() {
    // 1. Estado para controlar el tipo de mapa actual
    var mapType by remember { mutableStateOf(MapType.NORMAL) }

    Box(modifier = Modifier.fillMaxSize()) {
        // 2. GoogleMap configurado con las propiedades dinámicas
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            properties = MapProperties(mapType = mapType)
        )

        // 3. UI de control para cambiar el estado
        Row(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(onClick = { mapType = MapType.NORMAL }) { Text("Normal") }
            Button(onClick = { mapType = MapType.HYBRID }) { Text("Híbrido") }
            Button(onClick = { mapType = MapType.TERRAIN }) { Text("Terreno") }
        }
    }
}