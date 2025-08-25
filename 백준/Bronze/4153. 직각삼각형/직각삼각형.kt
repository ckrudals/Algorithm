// 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

fun main() {
    val reader = System.`in`.bufferedReader()
    val builder = StringBuilder()
    while (true) {
        val numbers = reader.readLine()!!.split(" ").map { it.toInt() }
        if (numbers.size == 3 && numbers.all { it == 0 }) break
        
        val max = numbers.max()
        val others = numbers.filter { it != max }

        if (others.sumOf { it * it } == max * max) {
            builder.append("right\n")
        } else {
            builder.append("wrong\n")
        }
    }
    println(builder.toString())
}