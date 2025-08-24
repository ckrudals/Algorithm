package `10951`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val a = reader.readLine()
        if (a.isNullOrEmpty()) return

        val (b, c) = a.split(" ").map { it.toInt() }
        println(solution(b, c))

        continue
    }
}