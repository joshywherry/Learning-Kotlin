package com.example.myapp

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Sites(){
    Row (
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

       Image(
           painter = painterResource(id = R.drawable.amazon),
           contentDescription = "amazon logo",
           modifier = Modifier.padding( 20.dp)
               .size(70.dp)
               .clip(RoundedCornerShape(15.dp))
       )
        Text(


            text = "Amazon",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            painter = painterResource(id = R.drawable.kilimall),
            contentDescription = "amazon logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(40.dp))
        )
        Text(


            text = "Killimall",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            painter = painterResource(id = R.drawable.jiji),
            contentDescription = "amazon logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(


            text = "Jiji",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            painter = painterResource(id = R.drawable.alibaba),
            contentDescription = "amazon logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(


            text = "Alibaba",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            painter = painterResource(id = R.drawable.ebay),
            contentDescription = "amazon logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(


            text = "Ebay",
            style = TextStyle(fontSize = 30.sp, color = Color(  0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    }

