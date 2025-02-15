package com.pjlaapps.maisumplano.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp


@Composable
fun Home(
    onTelaNovoPlano: () -> Unit,
    onTelaListarPlano: () -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(
                onClick = { onTelaNovoPlano() }
            ) {
                Text(text = "Cadastrar Novo Plano", color = Color.White)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { onTelaListarPlano() }
            ) {
                Text(text = "Listar Planos", color = Color.White)
            }

        }
    }
}

