import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val queue: Queue<Int> = LinkedList<Int>()
    val input = br.readLine().toInt()
    repeat(input) {
        val queueInput=br.readLine().split(' ')
        when (queueInput[0]) {
            "push" -> queue.offer(queueInput[1].toInt())
            "pop" -> bw.write("${if (queue.isEmpty()) -1 else queue.poll()}\n")
            "size" -> bw.write("${queue.size}\n")
            "empty" -> bw.write("${if (queue.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${if (queue.isEmpty()) -1 else queue.first()}\n")
            "back" -> bw.write("${if (queue.isEmpty()) -1 else queue.last()}\n")

        }
    }
    bw.flush()


}