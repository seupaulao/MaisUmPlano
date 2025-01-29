package com.pjlaapps.maisumplano.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pjlaapps.maisumplano.ScreenMain


/**
 * dúvidas:
 * como controlar a lista
 *   - passar parametro de visualizar ou nao
 *   - precisa de state para passar parametro?
 *   - calcular um novo tamanho e passar no vetor e exibir a lista
 */

@Composable
fun ListarPlano() {
    val linguagens = listOf("C++", "C", "C#", "Java", "Kotlin", "Dart", "Python", "Javascript", "SpringBoot",
        "XML", "Dart", "Node JS", "Typescript", "Dot Net", "GoLang", "MongoDb")

    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Exemplo de ListView",
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontSize = TextUnit(
                    value = 20.0F,
                    type = TextUnitType.Sp
                )
            )
        )
        LazyColumn {
            items(linguagens) {
                    it -> Text(text = it, modifier = Modifier.padding(15.dp))
                HorizontalDivider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLista() {
    ListarPlano()
}
