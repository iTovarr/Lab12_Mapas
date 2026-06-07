# Laboratorio 12: Mapas en Android con Jetpack Compose

Este proyecto implementa diversas funcionalidades de Google Maps, incluyendo dibujo de polígonos, rutas con polilíneas y gestión de ubicación en tiempo real.

## 📱 Capturas de Pantalla

| Vista General | Rutas y Polígonos | Selector de Tipo de Mapa |
| :---: | :---: | :---: |
| <img width="295" height="659" alt="image" src="https://github.com/user-attachments/assets/656b1a94-4be5-4d3d-a347-f2e291dfce8b" /> | <img width="240" height="532" alt="image" src="https://github.com/user-attachments/assets/c6038bfe-2dda-430b-a592-fa4e5d1080f7" /> | <img width="240" height="532" alt="image" src="https://github.com/user-attachments/assets/9a2f94b5-7493-4abc-b054-e23750088b09" /> |

---

## 🛠 Ejercicios Realizados

### 1. Dibujo de Formas en el Mapa
Se implementó la visualización de áreas específicas (Polígonos) y rutas de navegación (Polilíneas) utilizando coordenadas `LatLng`.
- **Polígonos:** Plaza de Armas, Mall Aventura y Parque Lambramani.
- **Polilíneas:** Rutas coloreadas para trayectos específicos (Lambramani-Porongoche, Universidades, Tecsup-Casa).

### 2. Selector de Tipo de Mapa
Funcionalidad para alternar dinámicamente entre los modos de visualización del mapa:
- `Normal`
- `Híbrido`
- `Terreno`
- **Video:** [Ver demostración en Google Drive](https://drive.google.com/file/d/1Vh1CssD92YdHbCWYsmBqpXdgQGSFqsGR/view?usp=sharing)

### 3. Ubicación Actual
Implementación de acceso a la geolocalización del usuario mediante el uso de permisos en tiempo de ejecución.
- **Funcionalidad:** Muestra el punto azul de ubicación tras otorgar permisos `ACCESS_FINE_LOCATION`.
- **Video:** [Ver demostración en Google Drive](https://drive.google.com/file/d/193uEB6skwXKv7AzVtVptM0NrPYQnspqt/view?usp=sharing)

---
