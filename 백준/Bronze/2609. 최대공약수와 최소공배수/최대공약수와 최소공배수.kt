fun main() {
    val reader = System.`in`.bufferedReader()
    val (a, b) = reader.readLine()!!.split(" ").map { it.toInt() }
    val max = listOf(a, b).max()
    var result1 = 0
   
    for (i in 1..max) {
        if (a % i == 0 && b % i == 0) {
            result1 = i
        }
    }

    var multipleA = a
    var multipleB = b

    while (multipleA != multipleB) {
        if (multipleA < multipleB) {
            multipleA += a
        } else {
            multipleB += b
        }
    }

    println(result1)
    println(multipleA)
}