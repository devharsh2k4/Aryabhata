package com.example.hackathoncheckin.Screens.participants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hackathoncheckin.db.DatabaseViewModel

@Composable
fun ParticipantScreen(navController: NavHostController = rememberNavController()) {

    val databaseViewModel = viewModel<DatabaseViewModel>()
    val userList = databaseViewModel.userList.value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       LazyColumn {
           items(userList){user->
               Text(text = user?.name ?: "-",
                   modifier = Modifier.padding(14.dp)
                   )

           }
       }

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
                databaseViewModel.update("User")
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewParticipantScreen(){
    ParticipantScreen()
}