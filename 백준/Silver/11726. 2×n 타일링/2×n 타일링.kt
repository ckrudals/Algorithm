var arr: IntArray = intArrayOf()
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()


    arr = IntArray(input + 1)

    bw.write("${dp(input)}")
    bw.flush()
}

fun dp(n: Int): Int {
    if (n == 0 || n == 1) return 1
    if (arr[n] != 0) return arr[n]

    arr[n] = (dp(n - 1) + dp(n - 2)) % 10007
    return arr[n]
}