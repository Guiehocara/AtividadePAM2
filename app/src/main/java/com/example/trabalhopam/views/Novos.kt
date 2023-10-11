package com.example.trabalhopam.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Novos(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),

    ){

        Spacer(modifier = Modifier.size(20.dp))

        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.background(Color.White).fillMaxWidth()
        ) {
            Row {
                Column(

                ) {
                    Text(text = "Novas casas")
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Novas casas", tint = Color.Red)
                }
            }
        }

        Spacer(modifier = Modifier.size(20.dp))



        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.background(Color.White).fillMaxWidth()
        ) {
            Row {
                Column(

                ) {
                    Text(text = "Novas casas")
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Novas casas", tint = Color.Red)
                }
            }
        }

        Spacer(modifier = Modifier.size(20.dp))

        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
        ) {
            Row {
                Column (
                ) {
                    Text(text = "Novas casas")
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Novas casas", tint = Color.Red)
                }
            }
        }


    }
}