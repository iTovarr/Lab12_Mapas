package com.example.lab12_maps

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.GoogleMap
import android.Manifest
import com.google.accompanist.permissions.*
import com.google.maps.android.compose.MapProperties

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MapScreen() {
    // 1. Manejo de permisos
    val locationPermissionState = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        )
    )

    // Lanzar solicitud de permisos al cargar la pantalla
    LaunchedEffect(Unit) {
        locationPermissionState.launchMultiplePermissionRequest()
    }

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            // 2. Activamos la capa de ubicación (punto azul) si tenemos permiso
            properties = MapProperties(
                isMyLocationEnabled = locationPermissionState.allPermissionsGranted
            )
        )
    }
}