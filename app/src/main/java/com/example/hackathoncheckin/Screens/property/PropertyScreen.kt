package com.example.hackathoncheckin.Screens.property

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PropertyScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "person pic"
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "UUID:")

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Registration",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
                )
            SwitchIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Breakfast",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Lunch",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Snacks",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Dinner",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Energy Drinks",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Breakfast II",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SwitchIcon()
        }


    }
}


@Composable
@Preview
fun SwitchIcon() {
    var checked by remember { mutableStateOf(true) }

    Switch(
        checked = checked,
        onCheckedChange = { checked = it },
        thumbContent = {
            if (checked) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(SwitchDefaults.IconSize),
                )
            }
        }
    )
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewPropertyScreen() {
    PropertyScreen()
}