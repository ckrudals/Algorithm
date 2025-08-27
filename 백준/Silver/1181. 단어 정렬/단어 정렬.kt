package `1181`

fun main() {
    val reader = System.`in`.bufferedReader()
    val number = reader.readLine()!!.toInt()
    val inputs = mutableListOf<String>()

    repeat(number) {
        inputs.add(reader.readLine()!!)
    }
    
    inputs
        .distinct()
        .sortedWith(compareBy<String> { it.length }.then(naturalOrder()))
        .map(::println)
}