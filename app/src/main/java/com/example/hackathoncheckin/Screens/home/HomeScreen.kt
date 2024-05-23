package com.example.hackathoncheckin.Screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController:NavHostController = rememberNavController(),
               onNavigateToScreen: ()-> Unit,
//               onNavigateToSearch:()->Unit,
//               onNavigateToParticipants:()->Unit,
//               onNavigateToSettings:()-> Unit,
               ) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier= Modifier.weight(0.5f)) {
                Card(elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .clickable {
                            onNavigateToScreen()
                        }) {
                    Column(modifier = Modifier.fillMaxWidth(),verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Icon(imageVector = Icons.Default.Menu,
                            contentDescription = "scanner icon",
                            modifier = Modifier.size(100.dp))
                        Text(text = "Open Scanner",
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column(modifier= Modifier.weight(0.5f)) {
                Card(elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp)
                        .clickable {
//                            onNavigateToParticipants()
                        }
                ){
                    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Default.AccountCircle,
                            contentDescription = "participant icon",
                            modifier = Modifier.size(100.dp))
                        Text(text = "All Participants",
                            textAlign = TextAlign.Center)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier= Modifier.weight(0.5f)) {
                Card(elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .clickable {
//                            onNavigateToSearch()
                        }) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(imageVector = Icons.Default.Search,
                            contentDescription = "search icon",
                            modifier = Modifier.size(100.dp))
                        Text(text = "Search User",
                            textAlign = TextAlign.Center)
                    }
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column(modifier= Modifier.weight(0.5f)) {
                Card(elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp)
                        .clickable {
//                            onNavigateToSettings()
                        }) {
                    Column(modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Default.Settings,
                            contentDescription = "settings icon",
                            modifier = Modifier.size(100.dp))
                        Text(text = "Settings")
                    }
                }
            }

        }
    }
}



