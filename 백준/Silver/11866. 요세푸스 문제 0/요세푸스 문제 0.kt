import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    val sb = StringBuilder("<")

    for (i in 1..n) queue.offer(i)

    while (queue.isNotEmpty()) {
        for (i in 0 until k - 1) {
            queue.offer(queue.poll())

        }
        if (queue.size == 1) sb.append("${queue.poll()}>")
        else sb.append("${queue.poll()}, ")
    }
    println(sb)





    bw.flush()
}