package com.rtu.number.game.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.rtu.number.game.navigation.NGNavHost

@Composable
fun NumberGameApp(
    navController: NavHostController,
) {
    Scaffold {
        NGNavHost(
            contentPadding = it,
            navController = navController,
        )
    }
}
