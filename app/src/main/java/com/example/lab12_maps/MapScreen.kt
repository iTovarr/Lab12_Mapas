package com.example.lab12_maps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Polygon
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen() {
    val ArequipaLocation = LatLng(-16.4040102, -71.559611)
    val cameraPositionState = rememberCameraPositionState {
        position = com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(ArequipaLocation, 13f)
    }

    // Polígonos
    val mallAventuraPolygon = listOf(
        LatLng(-16.432292, -71.509145),
        LatLng(-16.432757, -71.509626),
        LatLng(-16.433013, -71.509310),
        LatLng(-16.432566, -71.508853)
    )

    val parqueLambramaniPolygon = listOf(
        LatLng(-16.422704, -71.530830),
        LatLng(-16.422920, -71.531340),
        LatLng(-16.423264, -71.531110),
        LatLng(-16.423050, -71.530600)
    )

    val plazaDeArmasPolygon = listOf(
        LatLng(-16.398866, -71.536961),
        LatLng(-16.398744, -71.536529),
        LatLng(-16.399178, -71.536289),
        LatLng(-16.399299, -71.536721)
    )

    // Rutas (Polilíneas)
    val routes = listOf(
        // Ruta 1: Lambramani a Porongoche
        listOf(LatLng(-16.411189, -71.521332), LatLng(-16.417245, -71.515583)),
        // Ruta 2: Universidad Católica a Universidad San Martín
        listOf(LatLng(-16.406219, -71.547527), LatLng(-16.424333, -71.521669)),
        // Ruta 3: Tecsup a Casa
        listOf(LatLng(-16.429106, -71.519779), LatLng(-16.429196, -71.528212))
    )
    val routeColors = listOf(Color.Red, Color.Green, Color.Magenta)

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            // Dibujar Polígonos
            Polygon(points = plazaDeArmasPolygon, strokeColor = Color.Red, fillColor = Color.Blue.copy(alpha = 0.3f), strokeWidth = 5f)
            Polygon(points = parqueLambramaniPolygon, strokeColor = Color.Red, fillColor = Color.Blue.copy(alpha = 0.3f), strokeWidth = 5f)
            Polygon(points = mallAventuraPolygon, strokeColor = Color.Red, fillColor = Color.Blue.copy(alpha = 0.3f), strokeWidth = 5f)

            // Dibujar Rutas
            routes.forEachIndexed { index, path ->
                Polyline(
                    points = path,
                    color = routeColors.getOrElse(index) { Color.Black },
                    width = 12f
                )
            }
        }
    }
}