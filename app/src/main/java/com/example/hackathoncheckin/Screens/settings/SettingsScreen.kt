package com.example.hackathoncheckin.Screens.settings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SettingsScreen(navController:NavHostController= rememberNavController()){
Text(text = "Settings Screen")
}