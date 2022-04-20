val list = LongArray(91) { 0}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()


    bw.write("${fibo(br.readLine().toInt())}")
    bw.flush()
}

fun fibo(n: Int): Long {
    if (n <= 2) return 1
    if (list[n] != 0.toLong()) return list[n]
    list[n] = fibo(n - 1) + fibo(n - 2)
    return list[n]

}
