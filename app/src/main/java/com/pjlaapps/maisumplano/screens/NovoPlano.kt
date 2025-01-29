package com.pjlaapps.maisumplano.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pjlaapps.maisumplano.Routes


@Composable
fun NovoPlano(navController: NavHostController, modifier: Modifier = Modifier) {
    var nome by rememberSaveable {
        mutableStateOf("Meu Primeiro Plano")
    }
    var qtedias by rememberSaveable {
        mutableStateOf("30")
    }
    val context = LocalContext.current
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        // verticalArrangement = Arrangement.Center,
        // modifier = Modifier.fillMaxSize()
    )
    {
        Text(
            text = "Meu Primeiro Plano",
            modifier = modifier.padding(15.dp)
        )
        TextField(
            value = nome,
            onValueChange = {nome = it},
            label = { Text("Nome Plano") }
        )
        TextField(value = qtedias, onValueChange = {qtedias = it},
            label = { Text("Quantidade de Dias") }
        )

        Row {
            Button(
                modifier = Modifier.padding(10.dp),
                onClick = {

                    Toast.makeText(context, "Bem vindo ao APP!", Toast.LENGTH_LONG).show()
                }) {
                Text(text = "Criar")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { navController.navigate(Routes.Home) }) {
                Text(text = "Voltar")
            }
        }


     //   mostrarLista()
    }

}
