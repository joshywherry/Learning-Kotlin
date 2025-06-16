package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Dashboard(){
    Row (
        modifier = Modifier.fillMaxWidth()
            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Column {

            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home logo",
                modifier = Modifier.padding( 20.dp)
                    .size(70.dp)
                    .clip(RoundedCornerShape(15.dp))
            )
        }
        Spacer(Modifier.height(20.dp))
        Column {

            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "search logo",
                modifier = Modifier.padding( 20.dp)
                    .size(70.dp)
                    .clip(RoundedCornerShape(15.dp))
            )
        }
        Spacer(Modifier.height(20.dp))
        Column {

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile logo",
                modifier = Modifier.padding( 20.dp)
                    .size(70.dp)
                    .clip(RoundedCornerShape(15.dp))
            )
        }
    }
}