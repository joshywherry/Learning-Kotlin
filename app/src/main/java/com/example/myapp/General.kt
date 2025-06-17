package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GeneralShops(){
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
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

            modifier = Modifier.padding(20.dp),
            text = "Amazon",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
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

            modifier = Modifier.padding(20.dp),
            text = "Killimall",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
            .fillMaxWidth(),
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

            modifier = Modifier.padding(20.dp),
            text = "Jiji",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
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

            modifier = Modifier.padding(20.dp),
            text = "Alibaba",
            style = TextStyle(fontSize = 30.sp, color = Color(0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
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
            modifier = Modifier.padding(20.dp),
            text = "Ebay",
            style = TextStyle(fontSize = 30.sp, color = Color(  0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
    }

