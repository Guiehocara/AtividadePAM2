package com.example.trabalhopam.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(){
    Column(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(20.dp))

            TextButton(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth()
                .border(border = BorderStroke(4.dp, Color.Yellow))
                .background(color = Color.Transparent)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        Text(text = "Comprar", fontSize = 30.sp)
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Icon(imageVector = Icons.Outlined.Home, contentDescription = "Casa", modifier = Modifier.size(40.dp))
                    }
                }
            }
    }
}