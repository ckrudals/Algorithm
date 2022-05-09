fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (k, n) = br.readLine().split(" ").map { it.toInt() }

    val arr = IntArray(n)
    repeat(k) { it ->
        arr[it] = br.readLine().toInt()
    }


    var max = arr.maxOrNull()!!
    var min = 1

    var answer = 0

    while (min <= max) {
        val mid = min + (max - min) / 2
        var count = 0
        arr.forEach { count += it / mid }

        if (count >= n) {
            answer = mid
            if (min == Int.MAX_VALUE) break
            min = mid + 1
        } else {
            max = mid - 1
        }
    }
    bw.write("${answer}")
    bw.flush()
}