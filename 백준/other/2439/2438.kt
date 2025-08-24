package `2439`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(a: Int): String {
    val result = StringBuilder()

    (1..a).forEach {
        repeat(a - it) { result.append(" ") }
        repeat(it) { result.append('*') }
        result.append("\n")
    }

    return result.toString()
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = reader.readLine()!!.toInt()

    print(solution(a))
}