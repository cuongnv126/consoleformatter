package org.cuongnv.consoleformatter

object ConsoleFormat {
    fun String.fixLeft(length: Int): String {
        return String.format("%1$" + length + "s", this)
    }

    fun String.fixRight(length: Int): String {
        return String.format("%1$-" + length + "s", this)
    }

    fun String.color(color: String): String {
        return "$color$this${ConsoleColors.RESET}"
    }
}