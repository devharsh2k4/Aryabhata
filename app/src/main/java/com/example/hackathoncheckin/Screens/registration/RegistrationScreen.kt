package com.example.hackathoncheckin.Screens.registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        OutlinedTextField(label = {
            Text(text = "Name")
        })

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(label = {
            Text(text = "Email Address")
        })

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(label = {
            Text(text = "Contact Number")
        })

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(label = {
            Text(text = "University/School Name")
        })

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "Save Changes")
        }


    }
}


@Composable
fun OutlinedTextField(label: @Composable ()-> Unit,) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(

        value = text,
        onValueChange = { text = it },
        label = { label() },

    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewRegistration() {
    RegistrationScreen()
}