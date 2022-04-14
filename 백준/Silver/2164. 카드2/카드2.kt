import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()

    val deque: Deque<Int> = ArrayDeque()


    for (i in 1 .. input) {
        deque.add(i)
    }


    // 1234
    // 1 제거/ 234
    // 234 에서 2를  맨 뒤로
    // 342
    // 3제거
    // 42
    // 4뒤로보냄
    // 24
    // 2제거
    // 4

    // 1234
    while (deque.size > 1) {
        deque.pollFirst() // 첫번째 숫자 제거   //234

        deque.offerLast(deque.pollFirst())

    }
    bw.write("${deque.poll()}")
    bw.flush()

}