fun main() {
    val br = System.`in`.bufferedReader()

    val arr = mutableListOf<Int>()
    repeat(br.readLine().toInt()) {
        arr.add(br.readLine().toInt())
    }
    print(
        if (arr.filter { it == 1 }.count() > arr.filter { it == 0 }
                .count()) "Junhee is cute!" else "Junhee is not cute!"
    )
}