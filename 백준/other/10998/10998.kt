package `10998`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int): Int {
    return a * b
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = reader.readLine()!!.split(" ").map { it.toInt() }

    print(solution(a, b))
}