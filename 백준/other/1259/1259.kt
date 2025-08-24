package `1259`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = reader.readLine()!!
        if (input == "0") break

        if (input == input.reversed()) {
            println("yes")
        } else {
            println("no")
        }
    }
}