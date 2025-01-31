package com.pjlaapps.maisumplano

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pjlaapps.maisumplano.screens.Home
import com.pjlaapps.maisumplano.screens.ListarPlano
import com.pjlaapps.maisumplano.screens.NovoPlano


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface (color=MaterialTheme.colorScheme.background){
                ScreenMain()
            }
        }
    }
}

@Composable
fun ScreenMain(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Routes.Home) {
        composable<Routes.Home> {
            Home(
                onTelaNovoPlano = { navController.navigate(Routes.NovoPlano) },
                onTelaListarPlano = { navController.navigate(Routes.ListarPlano) }
            )
        }
        composable<Routes.NovoPlano> {
            NovoPlano(
                onHome = { navController.popBackStack() }
            )
        }
        composable<Routes.ListarPlano> {
            ListarPlano(
                onHome = { navController.popBackStack() }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MeuPrimeiroPlanoPreview() {
ScreenMain()
}