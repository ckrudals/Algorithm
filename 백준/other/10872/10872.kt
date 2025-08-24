package `10872`

import java.io.BufferedReader
import java.io.InputStreamReader

fun solution(n: Int): Int {
    var result = 1

    (1..n).forEach {
        result = result * n
    }

    return result
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    print(solution(reader.readLine()!!.toInt()))
}
