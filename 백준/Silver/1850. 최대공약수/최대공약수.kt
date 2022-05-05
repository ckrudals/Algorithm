fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (a, b) = br.readLine().split(" ").map { it.toLong() }


    for (i in 1..gcd(a, b)) {
        bw.write("1")
    }
    bw.flush()
}

fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) return a
    else
        gcd(b, a % b)
}