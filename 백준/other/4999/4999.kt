package `4999`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: String, b: String): String {
    return if (a.length >= b.length) "go" else "no"
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine()!!
    val b = reader.readLine()!!

    print(solution(a, b))
}