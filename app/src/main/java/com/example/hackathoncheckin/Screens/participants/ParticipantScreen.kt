package com.example.hackathoncheckin.Screens.participants

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ParticipantScreen(navController:NavHostController= rememberNavController()){
    Text(text = "All PArticipants")
}