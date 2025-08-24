package `1330`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int): String = when {
    a == b -> "=="
    a > b -> ">"
    else -> "<"
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = reader.readLine()!!.split(" ").map { it.toInt() }
    print(solution(a, b))
}