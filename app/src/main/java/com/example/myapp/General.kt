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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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

    val sites= listOf(
        Sites(
            "Amazon",
            R.drawable.amazon
        ),

        Sites(
            "Jiji",
            R.drawable.jiji
        ),
        Sites(
            "Jumia",
            R.drawable.jumia
        ),
        Sites(
            "Kilimall",
            R.drawable.kilimall
        ),

    )


    LazyColumn {
        itemsIndexed(sites) { index, site ->
            Row (
                modifier = Modifier
                    .padding(10.dp)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ebay.com"))
                        context.startActivity(intent)
                    }
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
                verticalAlignment = Alignment.CenterVertically
            ){

                Image(
                    painter = painterResource(id = site.image),
                    contentDescription = "amazon logo",
                    modifier = Modifier
                        .padding(20.dp)
                        .size(70.dp)
                        .clip(RoundedCornerShape(15.dp))
                )
                Text(
                    modifier = Modifier.padding(20.dp),
                    text =site.name,
                    style = TextStyle(fontSize = 30.sp, color = Color(  0xff0091ea), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                )

            }
        }
    }



    }



