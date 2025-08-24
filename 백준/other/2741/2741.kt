package `2741`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = reader.readLine()!!.toInt()

    (1 .. a).map {
        println(it)
    }
}