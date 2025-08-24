package `30007`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: List<Int>): Int {
    return a[0] * (a[2] - 1) + a[1]
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine()!!.toInt()
    val results = mutableListOf<Int>()

    repeat(a) {
        val input = reader.readLine()!!.split(" ").map { it.toInt() }

        results.add(solution(input))
    }

    results.map(::println)
}