package `10952`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val a = reader.readLine()
        val (b, c) = a.split(" ").map { it.toInt() }
        if (b == 0 && c == 0) break
        println(solution(b, c))
    }
}