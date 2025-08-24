package `2475`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(numbers: List<Int>): Int {
    return numbers.sumOf { it * it } % 10
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val result = solution(reader.readLine()!!.split(" ").map { it.toInt() })

    print(result)
}
