package com.example.trabalhopam.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.trabalhopam.componentes.Botao
import com.example.trabalhopam.componentes.toolbar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home() {
    toolbar(function = {conteudo()})
}

@Composable
fun conteudo() {
    Column(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize()
    ) {
        Botao(onClick = {Log.i("ola", "ola")}, titulo = "Alugar")


    }
}



