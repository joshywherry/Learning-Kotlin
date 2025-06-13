package com.example.myapp

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardContainer(){
    Row(
        Modifier.padding(20.dp)
            .background(color = Color.Black, RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Text(
            "Hello",
            style = TextStyle(Color.Red)
        )
    }
}