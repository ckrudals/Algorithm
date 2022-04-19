import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine().toInt()
    repeat(input) {
        val ps = br.readLine().toString()
        val psStack = Stack<Char>()
        try {
            for (i in ps) {

                when (i) {
                    '(' -> {
                        psStack.push(i)
                    }
                    ')' -> {
                        psStack.pop()
                    }
                }
            }
            if (psStack.isEmpty()) {
                bw.write("${"YES"}\n")
            } else {
                bw.write("${"NO"}\n")
            }

        } catch (e: Exception) {
            bw.write("${"NO"}\n")


        }
    }
    bw.flush()

}