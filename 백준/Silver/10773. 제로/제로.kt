import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine().toInt()

    val list = arrayListOf<Int>()
    repeat(input) {
        when (val money = br.readLine().toInt()) {
            0 -> {
                list.removeAt(list.size - 1)
            }
            else -> list.add(money)
        }
    }
    bw.write("${list.sum()}")
    bw.flush()
}