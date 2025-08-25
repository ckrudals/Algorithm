//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

fun main() {
    val reader = System.`in`.bufferedReader()
    val number = reader.readLine().toInt()
    val numbers = reader.readLine().split(" ").map { it.toInt() }

    numbers.count { number ->
        if (number < 2) {
            false
        } else {
            (2 until number).none { number % it == 0 }
        }
    }.also(::println)
}