import java.lang.StringBuilder

fun binary(arr: List<Int>, find: Int): Int {

    var low = 0
    var high = arr.size - 1
    var mid: Int
    while (low <= high) {
        mid = (low + high) / 2
        when {
            find == arr[mid] -> return 1
            find <= arr[mid] -> high = mid - 1
            else -> low = mid + 1
        }
    }
    return 0
}

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val m = br.readLine().split(" ").map { it.toInt() }.sorted()

    val k = br.readLine().toInt()
    val p = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()

    for (i in p) {
        print("${binary(m, i)} ")
    }
}