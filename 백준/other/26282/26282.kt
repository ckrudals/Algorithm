package `26282`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int, c: Int): Int {
    return (b / a * c) * 3
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (a, b, c) = reader.readLine()!!.split(" ").map { it.toInt() }

    print(solution(a, b, c))
}