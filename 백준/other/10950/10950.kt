package `10950`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = reader.readLine()!!.toInt()
    val results = mutableListOf<Int>()

    repeat(a) {
        val (b, c) = reader.readLine()!!.split(" ").map { it.toInt() }
        results.add(solution(b, c))
    }

    results.map(::println)
}