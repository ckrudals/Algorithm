package `11720`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var result = 0

    val a = reader.readLine().toInt()
    val b = reader.readLine()

    b.forEach {
        result += it.toString().toInt()
    }

    print(result)

}