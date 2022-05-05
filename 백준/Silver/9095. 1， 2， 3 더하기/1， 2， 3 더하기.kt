var arr: IntArray = intArrayOf()
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()

    arr = IntArray(12)
    arr[0] = 0
    arr[1] = 1
    arr[2] = 2
    arr[3] = 4

    repeat(input) {
        val n = br.readLine().toInt()
        bw.write("${dp(n)}\n")
    }

    bw.flush()
}

fun dp(n: Int): Int {
    if (arr[n] != 0) return arr[n]




    arr[n] = dp(n - 1) + dp(n - 2) + dp(n - 3)
    return arr[n]
}