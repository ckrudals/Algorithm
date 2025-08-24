package `31403`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine()
    val b = reader.readLine()
    val c = reader.readLine()


    println(a.toInt() + b.toInt() - c.toInt())
    println((a.toString() + b.toString()).toInt() - c.toInt())

}