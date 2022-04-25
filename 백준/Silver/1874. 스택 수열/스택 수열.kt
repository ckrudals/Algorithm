fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val stack = arrayListOf<Int>()
    val str = arrayListOf<String>()

    var count = 0

    for(i in 0 until n){
       val tmp = readLine().toInt()

        if(count < tmp) {
            for (j in count+1 .. tmp) {
                stack.add(j)
                str.add("+")
            }
            count = tmp
        }

        else if(stack[stack.size-1] != tmp){
            println("NO")
            return
        }

        stack.removeAt(stack.size-1)
        str.add("-")
    }

    str.forEach { println(it) }
}