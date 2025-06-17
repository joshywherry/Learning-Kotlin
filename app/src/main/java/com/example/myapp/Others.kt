package com.example.myapp



import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Others(){
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(width =1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            painter = painterResource(id = R.drawable.newegg),
            contentDescription = "newegg logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(

            modifier = Modifier.padding(20.dp),
            text = "Newegg",
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
            painter = painterResource(id = R.drawable.bh),
            contentDescription = "bh logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(40.dp))
        )
        Text(

            modifier = Modifier.padding(20.dp),
            text = "B&H Photo Video",
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
            painter = painterResource(id = R.drawable.zara),
            contentDescription = "micro center logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(

            modifier = Modifier.padding(20.dp),
            text = "Micro Center",
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
            painter = painterResource(id = R.drawable.tractor),
            contentDescription = "tractor house logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(

            modifier = Modifier.padding(20.dp),
            text = "Tractor House",
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
            painter = painterResource(id = R.drawable.agrimag),
            contentDescription = "agrimag logo",
            modifier = Modifier.padding( 20.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(
            modifier = Modifier.padding(20.dp),
            text = "AgriMag",
            style = TextStyle(fontSize = 30.sp, color = Color(  0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        )

    }
}

