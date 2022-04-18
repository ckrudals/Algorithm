import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()
    val count = br.readLine().split(" ").map { it.toInt() }.count {
        var isPrime = true

        if (it == 1) {
            isPrime = false
        } else {
            for (i in 2 until it) {
                if (it % i == 0) isPrime = false
            }
        }

        isPrime
    }




    bw.write("${count}")
    bw.flush()
}

fun isPrimes(n: Int): Boolean {
    var i = 2
    while (i * i <= n) {
        if (n % i++ == 0) return false
    }
    return true

}
