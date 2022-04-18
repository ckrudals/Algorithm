import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = ArrayList<Pair<Int, Int>>()
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        arr.add(Pair(n, m))
    }
    arr.sortWith { d1, d2 ->
        if (d1.second == d2.second) {
            d1.first - d2.first
        } else {
            d1.second - d2.second
        }
    }
    arr.forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
}

