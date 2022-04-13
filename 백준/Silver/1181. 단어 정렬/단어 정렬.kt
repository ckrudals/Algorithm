import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()
    val list = mutableListOf<String>()

    repeat(input) {
        val word = br.readLine().toString()
        list.add(word)
    }
    list.distinct().sorted().sortedBy { it.length }.map { it ->
        bw.write("${it}\n")
    }
    bw.flush()
}