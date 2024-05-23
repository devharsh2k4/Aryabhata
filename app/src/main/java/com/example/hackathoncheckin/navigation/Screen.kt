package com.example.hackathoncheckin.navigation

sealed class Screen(val route:String){
    object Home: Screen("home_screen")
    object Scan: Screen("scan_screen")
    object Participant: Screen("participant_screen")
    object Search: Screen("search_screen")
    object Settings: Screen("settings_screen")
}