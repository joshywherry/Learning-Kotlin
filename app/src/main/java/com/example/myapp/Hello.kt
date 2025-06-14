package com.example.myapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Hello() {
    var text1 by remember {
        mutableStateOf(true)
    }
    Row(
        Modifier.fillMaxWidth()
            .padding(top = 50.dp, start = 20.dp, end = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,


    ) {
        if (text1){
            Text(
                "Hello"
            )
        }
        else{
            Text(
                "arwqqrq"
            )
        }
        Button(
            onClick = {

            }
        ) {
            Text(
                "Button",
                Modifier.padding(start = 10.dp, end = 10.dp)
            )
        }
    }
}