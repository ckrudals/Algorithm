import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    // 3 개의 카드의 합이 n을 넘지안는 섬에서 가장크게


    // 카드제한 : m,
    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()

    val mInput = br.readLine().split(" ").map { it.toInt() }

    mInput.forEach {
        list.add(it)

    }

    var maxSum = 0
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            for (p in j + 1 until list.size) {
                val sum = list[i] + list[j] + list[p] // 3개의 합

//   3개의 합이 최대값보다 작거나 같아야함
                if (maxSum <= sum && sum <= n) {maxSum = sum}

            }
        }
    }
    bw.write("${maxSum}")
    bw.flush()
}