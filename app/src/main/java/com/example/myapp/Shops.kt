package com.example.myapp

import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Shops(){
    Row (modifier = Modifier
       .background(color = Color(0xff0091ea))
        .fillMaxWidth()
        .height(50.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,


    )
    {
        Button(onClick = {},
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xff0091ea))
            )
        {
            Text(
                modifier = Modifier
                    .padding(20.dp, 10.dp, 20.dp, 10.dp),
                text = "GENERAL",
                style = TextStyle(color =Color(0xFFFFc107), fontSize = 15.sp, FontWeight.Bold)
            )

        }
        Button(
            onClick = {},
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xff0091ea))
        )
        {
            Text(
                modifier = Modifier
                    .padding(20.dp, 10.dp, 20.dp, 10.dp),
                text = "FASHION",
                style = TextStyle(color = Color(0xFFFFc107), fontSize = 15.sp, FontWeight.Bold)
            )

        }
        Button(onClick = {},
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xff0091ea))

        ) {
            Text(
                modifier = Modifier
                    .padding(20.dp, 10.dp, 20.dp, 10.dp),
                text = "OTHERS",
                style = TextStyle(color = Color(0xFFFFc107), fontSize = 15.sp, FontWeight.Bold)
            )

        }




    }

}


