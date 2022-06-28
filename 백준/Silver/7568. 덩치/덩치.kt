fun main() {
    val count = readln().toInt()
    val inputs = Array(count) { readln().split(' ').map { it.toInt() } }

    val output = StringBuilder()
    for (input in inputs) {
        var rank = 1
        for(input2 in inputs) {
            if(input2[0] > input[0] && input2[1] > input[1]) rank++
        }
        output.append(rank).append(' ')
    }
    println(output)
}