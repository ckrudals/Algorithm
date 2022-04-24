fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val deque = ArrayDeque<Int>()
    val input = br.readLine().toInt()
    repeat(input) {
        val n = br.readLine().split(" ")
        when (n[0]) {
            "push_back" -> deque.addLast(n[1].toInt())
            "push_front" -> deque.addFirst(n[1].toInt())
            "pop_front" -> {
                if (deque.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${deque.removeFirst()}\n")
                }
            }
            "pop_back" -> {
                if (deque.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${deque.removeLast()}\n")
                }
            }
            "size" -> bw.write("${deque.size}\n")
            "empty" -> {
                if (deque.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }

            }
            "front" -> {
                if (deque.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${deque.first()}\n")
                }
            }
            "back" -> {
                if (deque.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${deque.last()}\n")
                }
            }
        }
    }
    bw.flush()
    bw.close()
}