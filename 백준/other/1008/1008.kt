package `1008`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = reader.readLine()!!.split(" ").map { it.toDouble() }

    print(solution(a, b))
}