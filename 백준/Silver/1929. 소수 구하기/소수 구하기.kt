import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    for (i in n..m) {
        if (isPrimeNumber(i)) {
            bw.write("${i}\n")
        }
    }
    bw.flush()
}

fun isPrimeNumber(num: Int): Boolean {

    val end = sqrt(num.toDouble())

    if (num == 1) return false

    for (i in 2..end.roundToInt()) {
        if (num % i == 0) return false

    }
    return true


}

