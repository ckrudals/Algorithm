import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun solution(a: Long, b: Long): Long {
    return abs(b - a)
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (a, b) = reader.readLine()!!.split(" ").map { it.toLong() }

    print(solution(a, b))
}