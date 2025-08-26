package `1152`

fun main() {
    val reader = System.`in`.bufferedReader()
    val input = reader.readLine()!!.split(" ").map { it }

    print(input.count { it != "" && it !=" "})
}