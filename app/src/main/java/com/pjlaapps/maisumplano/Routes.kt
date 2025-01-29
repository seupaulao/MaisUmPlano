package com.pjlaapps.maisumplano

sealed class Routes(val route: String) {
    object Home: Routes("home")
    object NovoPlano: Routes("novoplano")
    object ListarPlano: Routes("listarplano")
}