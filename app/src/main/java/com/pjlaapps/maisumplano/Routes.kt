package com.pjlaapps.maisumplano

import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    object Home
    @Serializable
    object NovoPlano
    @Serializable
    object ListarPlano
}