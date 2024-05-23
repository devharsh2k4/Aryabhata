package com.example.hackathoncheckin.Screens.scan

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScanScreen(navController: NavHostController = rememberNavController()){
    Text(text = "Scan Screen")
}