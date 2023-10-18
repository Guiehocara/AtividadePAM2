package com.example.trabalhopam.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trabalhopam.R

@Composable
fun Card2(onClick: () -> Unit){
    ElevatedCard(
        modifier = Modifier.width(210.dp).padding(2.dp)
    ) {

        Image(painter = painterResource(id = R.drawable.pexels_thgusstavo_santana_2102587), contentDescription = "Imagem", modifier = Modifier.size(200.dp))
        Text(text = "Casa para compra 4 dormitorios 2 banehiros", fontSize = 20.sp)
        Spacer(modifier = Modifier.size(30.dp))
    }
}