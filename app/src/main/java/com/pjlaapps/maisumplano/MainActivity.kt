package com.pjlaapps.maisumplano

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Label
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjlaapps.maisumplano.ui.theme.MaisUmPlanoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaisUmPlanoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaCadastro(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TelaCadastro(modifier: Modifier = Modifier) {
    var nome by rememberSaveable {
        mutableStateOf("Meu Primeiro Plano")
    }
    var qtedias by rememberSaveable {
        mutableStateOf("30")
    }
    val context = LocalContext.current
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    )
    {
        Text(
            text = "Meu Primeiro Plano",
            modifier = modifier.padding(15.dp)
        )
        TextField(
            value = nome,
            onValueChange = {nome = it},
            label = {Text("Nome Plano")}
        )
        TextField(value = qtedias, onValueChange = {qtedias = it},
            label = {Text("Quantidade de Dias")}
            )

        Button(
            modifier = Modifier.padding(10.dp),
            onClick = {

            Toast.makeText(context, "Bem vindo ao APP!", Toast.LENGTH_LONG).show()
        }) {
            Text(text = "Criar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MeuPrimeiroPlanoPreview() {
    MaisUmPlanoTheme {
        TelaCadastro()
    }
}