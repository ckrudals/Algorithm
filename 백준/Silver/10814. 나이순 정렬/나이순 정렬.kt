package `10814`

data class Result(
    val index: Int,
    val age: Int,
    val name: String
)

fun main() {
    val reader = System.`in`.bufferedReader()
    val number = reader.readLine()!!.toInt()
    val inputs = mutableListOf<Result>()
    repeat(number) { index ->
        val (age, name) = reader.readLine()!!.split(" ")
        inputs.add(Result(index, age.toInt(), name))
    }

    inputs.sortWith(compareBy<Result> { it.age }.thenBy { it.index})

    inputs.forEach {
        println("${it.age} ${it.name}")
    }
}