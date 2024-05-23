package com.example.hackathoncheckin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.hackathoncheckin.Screens.home.HomeScreen
import com.example.hackathoncheckin.Screens.participants.ParticipantScreen
import com.example.hackathoncheckin.Screens.scan.ScanScreen
import com.example.hackathoncheckin.Screens.search.SearchScreen
import com.example.hackathoncheckin.Screens.settings.SettingsScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        navigation(
            startDestination = Screen.Home.route,
            route = Screen.Home.route
        ) {
            composable(route = Screen.Home.route) {
                val viewModel =
                    it.sharedViewModel<NavigationViewModel>(navController = navController)
                HomeScreen(

                    onNavigateToScreen = {
                        navController.navigate(Screen.Scan.route){
                            popUpTo(Screen.Home.route){
                                inclusive = true
                            }
                        }
                    }

                )
            }

            navigation(
                startDestination = Screen.Scan.route,
                route = Screen.Scan.route
            ) {
                composable(route = Screen.Scan.route) {
                    val viewModel =
                        it.sharedViewModel<NavigationViewModel>(navController = navController)
                    ScanScreen(

                    )
                }
            }

            navigation(
                startDestination = Screen.Participant.route,
                route = Screen.Participant.route
            ) {
                composable(route = Screen.Participant.route) {
                    val viewModel =
                        it.sharedViewModel<NavigationViewModel>(navController = navController)
                    ParticipantScreen(

                    )
                }
            }

            navigation(
                startDestination = Screen.Search.route,
                route = Screen.Search.route
            ) {
                composable(route = Screen.Search.route) {
                    val viewModel =
                        it.sharedViewModel<NavigationViewModel>(navController = navController)
                    SearchScreen()
                }
            }

            navigation(
                startDestination = Screen.Settings.route,
                route = Screen.Settings.route
            ) {
                composable(route = Screen.Settings.route) {
                    val viewModel =
                        it.sharedViewModel<NavigationViewModel>(navController = navController)
                    SettingsScreen()
                }
            }

        }
    }
}

@Composable
inline fun <reified T : ViewModel> NavBackStackEntry
    .sharedViewModel(navController: NavHostController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}