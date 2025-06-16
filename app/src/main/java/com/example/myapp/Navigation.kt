package com.example.myapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import java.time.format.TextStyle



@Composable
fun Navigation() {

    Row(
        Modifier.fillMaxWidth()

            .padding(top = 60.dp, start = 20.dp, end = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,

        verticalAlignment = Alignment.CenterVertically


    ) {
            Text(
                text = "Your All-In-One Shop",
                style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFFc107))
            )




        Button(
            onClick = {

            }
        ) {
            Text(
                "View Cart",
                Modifier.padding(start = 10.dp, end = 10.dp,)
            )
        }
    }
}