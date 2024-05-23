package com.example.hackathoncheckin.Screens.participants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hackathoncheckin.db.DatabaseViewModel

@Composable
fun ParticipantScreen(navController: NavHostController = rememberNavController()) {

    val databaseViewModel = viewModel<DatabaseViewModel>()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "All Participants")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                databaseViewModel.read("User")
            }) {

                Text(text = "Read")
            }
            Button(onClick = {
                databaseViewModel.write("User")
            }) {
                Text(text = "Write")
            }
            Button(onClick = {
                databaseViewModel.update()
            }) {
                Text(text = "Update")
            }
            Button(onClick = {
                databaseViewModel.delete()
            }) {
                Text(text = "Delete")
            }
        }
    }


}