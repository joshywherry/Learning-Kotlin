package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.platform.LocalContext


@Composable
fun GeneralShops(){
    val context = LocalContext.current
    Row (
        modifier = Modifier
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com"))
                context.startActivity(intent)
            }
        .padding(10.dp)
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
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kilimall.co.ke"))
                context.startActivity(intent)
            }
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
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jiji.co.ke"))
                context.startActivity(intent)
            }
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
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alibaba.com"))
                context.startActivity(intent)
            }
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
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ebay.com"))
                context.startActivity(intent)
            }
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

