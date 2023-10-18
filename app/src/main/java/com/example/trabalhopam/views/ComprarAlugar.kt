package com.example.trabalhopam.views

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.trabalhopam.componentes.Card2
import com.example.trabalhopam.componentes.toolbar

@Composable
fun ComprarAlugar(){
toolbar {
    Column (
        modifier = Modifier.fillMaxWidth()
    ){
        Row {
            Text(text = "Casas para comprar", fontSize = 40.sp)
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Card2(onClick = { Log.i("ola", "ola") })
            Card2(onClick = { Log.i("ola", "ola") })
            Card2(onClick = { Log.i("ola", "ola") })
            Card2(onClick = { Log.i("ola", "ola") })

        }
    }
}
}