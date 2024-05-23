package com.example.hackathoncheckin.Screens.search

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SearchScreen(navController:NavHostController= rememberNavController()){
    Text(text = "search Screen")
}