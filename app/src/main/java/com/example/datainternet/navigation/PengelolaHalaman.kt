package com.example.datainternet.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController()

) {

    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = {
                navController.navigate(DestinasiEntry.route)
            },
                onDetailClick = {
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(navigateBack = {
                navController.navigate(
                    DestinasiHome.route
                ) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}