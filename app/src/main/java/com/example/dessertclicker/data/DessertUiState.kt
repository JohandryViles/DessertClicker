package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

/**
 * Estado de la IU para la pantalla Dessert Clicker.
 * Retiene todos los datos necesarios para la IU, en lugar de
 * gestionarlos con remember/rememberSaveable en el composable.
 */
data class DessertUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)
