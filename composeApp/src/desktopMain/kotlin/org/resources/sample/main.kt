package org.resources.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.Desktop

fun main() = application {

    Desktop.getDesktop().setOpenURIHandler {
        println("URI_HANDLED: ${it.uri}")
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProject",
    ) {
        App()
    }
}