fun main() {
    val br = System.`in`.bufferedReader()
    var count = 0 // 사이클 count
    val input = br.readLine().toInt() // 26
    var first = 0
    var second = 0
    var number = input
    do {
        if (input < 10) {
            number += input * 10
        }
        if (number == input) {
            first = input / 10 // 2
            second = input % 10 // 6
        } else {
            first = number / 10
            second = number % 10
        }
        val sum = first + second

        if (sum < 10) number = sum + (second * 10)
        else number = (second * 10) + sum % 10

        count++

    } while (input != number)
    print(count)
}